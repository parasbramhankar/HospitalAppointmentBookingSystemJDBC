package org.example.AppointmentRelatedOperations;

import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateAppointmentStatus {

    Scanner scanner=new Scanner(System.in);

    public void updateAppointment(){
        String str="update appointment status=complete where appointmentId=?";

        try{
            Connection connection= ConnectionDetails.establishConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(str);
            preparedStatement.setInt(1,scanner.nextInt());

            int num= preparedStatement.executeUpdate();

            if(num>0){
                System.out.println(" Appointment Status set to Completed");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
