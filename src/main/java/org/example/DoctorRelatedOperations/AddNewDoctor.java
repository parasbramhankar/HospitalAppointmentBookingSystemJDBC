package org.example.DoctorRelatedOperations;

import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddNewDoctor {
     Scanner scanner=new Scanner(System.in);

     public void addDoctor(){

        String sql="insert into doctor (doctorId,name,specialization,phone,email) " +
                "values ( ?,?,?,?,?)";
        try{
            Connection connection= ConnectionDetails.establishConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            System.out.println("Enter the doctorId");
            preparedStatement.setInt(1,scanner.nextInt());
            System.out.println("Enter the name");
            preparedStatement.setString(2, scanner.next());
            System.out.println("Enter the specialization");
            preparedStatement.setString(3, scanner.next());
            System.out.println("Enter phone number");
            preparedStatement.setString(4, scanner.next());
            System.out.println("Enter the email: ");
            preparedStatement.setString(5, scanner.next());

            int n=preparedStatement.executeUpdate();
            if(n>0){
                System.out.println("Row added successfully");
            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
