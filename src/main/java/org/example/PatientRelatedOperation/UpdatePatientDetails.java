package org.example.PatientRelatedOperation;

import org.example.ConnectionDetails;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePatientDetails {
     Scanner scanner=new Scanner(System.in);

     public void updatePatDetails(){
         String str = "update patient set email=? where patientId=?";

     try {
      Connection connection = ConnectionDetails.establishConnection();

      PreparedStatement preparedStatement = connection.prepareStatement(str);

      System.out.println("Enter Patient Id: ");
      preparedStatement.setInt(2, scanner.nextInt());

      System.out.println("Enter Email: ");
      preparedStatement.setString(1, scanner.next());

      int n = preparedStatement.executeUpdate();

      if (n>0) {
          System.out.println("Row updated Successfully");
      }
  }catch (Exception e){
      System.out.println(e.getMessage());
  }

 }
}
