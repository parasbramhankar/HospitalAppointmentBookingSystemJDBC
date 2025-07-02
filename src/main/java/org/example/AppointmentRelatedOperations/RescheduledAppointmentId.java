package org.example.AppointmentRelatedOperations;

import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RescheduledAppointmentId {
    public void rescheduleAppointment() {
        String query = "UPDATE appointment SET date = ?, time = ? WHERE appointmentId = ?";

        try (Connection connection = ConnectionDetails.establishConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);

             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter Appointment ID to reschedule: ");
            int appointmentId = scanner.nextInt();

            System.out.print("Enter new Date (yyyy-mm-dd): ");
            String dateInput = scanner.next();
            java.sql.Date newDate = java.sql.Date.valueOf(dateInput);

            System.out.print("Enter new Time (HH:mm:ss): ");
            String timeInput = scanner.next();
            java.sql.Time newTime = java.sql.Time.valueOf(timeInput);

            preparedStatement.setDate(1, newDate);
            preparedStatement.setTime(2, newTime);
            preparedStatement.setInt(3, appointmentId);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Appointment rescheduled successfully.");
            } else {
                System.out.println("No appointment found with the given ID.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
