package org.example.DoctorRelatedOperations;

import org.example.Appointment;
import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ViewAppointmentScheduled {
    public void displayAppointmentByDoctorId(){
        String str="Select * from appointment where doctorId=?";
        try {
            Connection connection= ConnectionDetails.establishConnection();
            PreparedStatement preparedStatement= connection.prepareStatement(str);
            System.out.println("Enter Doctor id: ");
            Scanner scanner=new Scanner(System.in);

            preparedStatement.setInt(1,scanner.nextInt());
            ResultSet resultSet =preparedStatement.executeQuery();

            while(resultSet.next()){
                int id=resultSet.getInt("appointmentId");
                int doctorId=resultSet.getInt("doctorId");
                int patientId= resultSet.getInt("patientId");
                LocalDate date= resultSet.getDate("date").toLocalDate();
                LocalTime time=resultSet.getTime("time").toLocalTime();
                String status= resultSet.getString("status");

                Appointment appointment=new Appointment(id,doctorId,patientId,date,time,status);
                System.out.println(appointment);
            }

            connection.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
