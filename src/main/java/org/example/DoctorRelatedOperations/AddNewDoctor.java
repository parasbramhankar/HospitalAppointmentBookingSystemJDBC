package org.example.DoctorRelatedOperations;

import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddNewDoctor {
     Scanner scanner=new Scanner(System.in);

     public void addDoctor(){

        String sql="insert into doctor (doctorId,name,specialization,phone,email) " +
                "value ( ?,?,?,?,?)";
        try{
            Connection connection= ConnectionDetails.establishConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            preparedStatement.setInt(1,scanner.nextInt());
            preparedStatement.setString(2, scanner.next());
            preparedStatement.setString(3, scanner.next());
            preparedStatement.setString(4, scanner.next());

            int n= preparedStatement.executeUpdate();
            if(n==0){
                System.out.println("Row added successfully");
            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
