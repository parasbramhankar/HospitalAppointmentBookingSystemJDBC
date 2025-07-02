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
           System.out.println("Enter patient id");
           preparedStatement.setInt(1,scanner.nextInt());
           System.out.println("Enter name");
           preparedStatement.setString(2, scanner.next());
           System.out.println("Enter the gender");
           preparedStatement.setString(3, scanner.next());
           System.out.println("Enter the age");
           preparedStatement.setInt(4, scanner.nextInt());
           System.out.println("Enter the phone");
           preparedStatement.setString(5, scanner.next());
           System.out.println("Enter the email: ");
           preparedStatement.setString(6, scanner.next());
           System.out.println("Enter the address: ");
           preparedStatement.setString(7, scanner.next());

           int n=preparedStatement.executeUpdate();

           if(n>0){
               System.out.println("Patient details added successfully");
           }


       }catch (Exception e){
           System.out.println(e.getMessage());
       }

    }
}
