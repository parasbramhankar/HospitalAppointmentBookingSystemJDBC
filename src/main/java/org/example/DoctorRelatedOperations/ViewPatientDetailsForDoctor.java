package org.example.DoctorRelatedOperations;

import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ViewPatientDetailsForDoctor {

    public void viewPatientDetailsByDoctorId() {
        String query = "SELECT p.patientId, p.name, p.age, p.gender, p.phone " +
                "FROM appointment a " +
                "JOIN patient p ON a.patientId = p.patientId " +
                "WHERE a.doctorId = ?";

        try {
            Connection connection = ConnectionDetails.establishConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);


            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the doctor id");
            int doctorId = scanner.nextInt();
            preparedStatement.setInt(1, doctorId);

            ResultSet resultSet = preparedStatement.executeQuery();

            boolean found = false;
            while (resultSet.next()) {
                found = true;
                int patientId = resultSet.getInt("patientId");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                String contact = resultSet.getString("phone");

                System.out.println("Patient ID: " + patientId +
                        ", Name: " + name +
                        ", Age: " + age +
                        ", Gender: " + gender +
                        ", Contact: " + contact);
            }

            if (!found) {
                System.out.println("No patients found for Doctor ID: " + doctorId);
            }

            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
