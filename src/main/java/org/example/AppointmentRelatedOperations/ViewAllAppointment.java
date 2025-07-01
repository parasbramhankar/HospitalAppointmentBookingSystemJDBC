package org.example.AppointmentRelatedOperations;

import org.example.Appointment;
import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;

public class ViewAllAppointment {

    public void displayAppointment(){

        String str="Select * from appointment";

        try{
            Connection connection= ConnectionDetails.establishConnection();

            PreparedStatement preparedStatement= connection.prepareStatement(str);

            ResultSet resultSet= preparedStatement.executeQuery();

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
