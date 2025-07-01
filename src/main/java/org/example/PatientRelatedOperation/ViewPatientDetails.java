package org.example.PatientRelatedOperation;

import org.example.ConnectionDetails;
import org.example.Patient;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewPatientDetails {

    public void viewAllPatientDetails() {

        String string="select * from patient";

        try{
            Connection connection=ConnectionDetails.establishConnection();

            PreparedStatement preparedStatement=connection.prepareStatement(string);

            ResultSet resultSet= preparedStatement.executeQuery();

            while (resultSet.next()){

                Patient patient=new Patient(resultSet.getInt("patientId"),resultSet.getString("name"),resultSet.getString("gender"),
                        resultSet.getInt("age"),resultSet.getString("phone"),resultSet.getString("email"),resultSet.getString("address"));

                System.out.println(patient);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public void viewPatientDetailsByName(){

        String str="select * from patient where name=?";

        try{
            Connection connection=ConnectionDetails.establishConnection();

            PreparedStatement preparedStatement=connection.prepareStatement(str);

            // 3. Take input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter patient ID: ");
            preparedStatement.setInt(1, scanner.nextInt());

            // 4. Execute query
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){

                Patient patient=new Patient(resultSet.getInt("patientId"),resultSet.getString("name"),resultSet.getString("gender"),
                        resultSet.getInt("age"),resultSet.getString("phone"),resultSet.getString("email"),resultSet.getString("address"));

                System.out.println(patient);

            }

            System.out.println(resultSet);

        } catch (IOException | SQLException e) {
            System.out.println("Message: "+e.getMessage());
        }
    }
}
