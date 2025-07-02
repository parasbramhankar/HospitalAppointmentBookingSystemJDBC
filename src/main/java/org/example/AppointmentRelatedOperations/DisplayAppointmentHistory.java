package org.example.AppointmentRelatedOperations;

import org.example.Appointment;
import org.example.ConnectionDetails;
import org.postgresql.jdbc.PgConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class DisplayAppointmentHistory {

    public void appointmentHistory(){

        String sql="select * from appointment where patientId=?";

        try{
            Connection connection= ConnectionDetails.establishConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            System.out.println("Enter the patient Id: ");
            Scanner scanner=new Scanner(System.in);
            preparedStatement.setInt(1,scanner.nextInt());


            ResultSet resultSet=preparedStatement.executeQuery();

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

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
