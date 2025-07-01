package org.example.AppointmentRelatedOperations;

import org.example.ConnectionDetails;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookAppointment {

    Scanner scanner=new Scanner(System.in);
    public void bookAppointment(){
        String string="Insert into appointment (appointmentId,doctorId,patientId,date,time,status) values (?,?,?,?,?,?)";

        try{
            Connection connection=ConnectionDetails.establishConnection();
            PreparedStatement ps = connection.prepareStatement(string);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Appointment ID: ");
            ps.setInt(1, sc.nextInt());

            System.out.print("Enter Doctor ID: ");
            ps.setInt(2, sc.nextInt());

            System.out.print("Enter Patient ID: ");
            ps.setInt(3, sc.nextInt());

            System.out.print("Enter Appointment Date (yyyy-mm-dd): ");
            String dateStr = sc.next();
            java.sql.Date date = java.sql.Date.valueOf(dateStr);
            ps.setDate(4, date);

            System.out.print("Enter Appointment Time (HH:mm:ss): ");
            String timeStr = sc.next();
            java.sql.Time time = java.sql.Time.valueOf(timeStr);
            ps.setTime(5, time);

            System.out.print("Enter Status (Booked/Completed/Cancelled): ");
            ps.setString(6, sc.next());

            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted.");

            ps.close();
            connection.close();
            sc.close();

        } catch (IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
