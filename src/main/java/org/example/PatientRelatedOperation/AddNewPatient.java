package org.example.PatientRelatedOperation;

import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddNewPatient {

    Scanner scanner=new Scanner(System.in);
    public void addNewPatient(){

        String sql = "INSERT INTO patient (patientId, name, gender, age, phone, email, address) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

       try{
           Connection connection=ConnectionDetails.establishConnection();

           PreparedStatement preparedStatement= connection.prepareStatement(sql);
           preparedStatement.setInt(1,scanner.nextInt());
           preparedStatement.setString(2, scanner.next());
           preparedStatement.setString(3, scanner.next());
           preparedStatement.setInt(4, scanner.nextInt());
           preparedStatement.setString(5, scanner.next());
           preparedStatement.setString(6, scanner.next());
           preparedStatement.setString(7, scanner.next());

           int n=preparedStatement.executeUpdate();

           if(n==0){
               System.out.println("Patient details added successfully");
           }


       }catch (Exception e){
           System.out.println(e.getMessage());
       }

    }
}
