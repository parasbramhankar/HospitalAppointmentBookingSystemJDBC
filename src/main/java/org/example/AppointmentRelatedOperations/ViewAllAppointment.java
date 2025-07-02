package org.example.AppointmentRelatedOperations;

import org.example.Appointment;
import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class ViewAllAppointment {

    public void displayAppointment() {
        String str = "SELECT * FROM appointment";

        try {
            Connection connection = ConnectionDetails.establishConnection();

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(str);

            while (resultSet.next()) {
                int id = resultSet.getInt("appointmentId");
                int doctorId = resultSet.getInt("doctorId");
                int patientId = resultSet.getInt("patientId");
                LocalDate date = resultSet.getDate("date").toLocalDate();
                LocalTime time = resultSet.getTime("time").toLocalTime();
                String status = resultSet.getString("status");

                Appointment appointment = new Appointment(id, doctorId, patientId, date, time, status);
                System.out.println(appointment);
            }

            // Close resources (optional but recommended)
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
