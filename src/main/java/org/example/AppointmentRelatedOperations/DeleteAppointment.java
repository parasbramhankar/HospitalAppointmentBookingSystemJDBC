package org.example.AppointmentRelatedOperations;

import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteAppointment {

    Scanner scanner=new Scanner(System.in);
    public void deleteAppointment(){

        String str="delete from appointment where appointmentId = ?";

        try{
            Connection connection=ConnectionDetails.establishConnection();

            PreparedStatement preparedStatement= connection.prepareStatement(str);
            preparedStatement.setInt(1,scanner.nextInt());
            int n=preparedStatement.executeUpdate();
            if(n==0){
                System.out.println("Row deleted successfully");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
