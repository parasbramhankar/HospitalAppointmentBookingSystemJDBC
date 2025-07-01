package org.example.DoctorRelatedOperations;

import org.example.ConnectionDetails;
import org.example.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ViewDoctorDetails {
   Scanner scanner=new Scanner(System.in);

    public void viewDoctors(){

        String str="select * from doctor";

        try{
            Connection connection= ConnectionDetails.establishConnection();

            PreparedStatement preparedStatement= connection.prepareStatement(str);
            ResultSet resultSet= preparedStatement.executeQuery();

            while(resultSet.next()){

                //Object to set the values to the doctor object
                Doctor doctor=new Doctor();

                doctor.setDoctorId(resultSet.getInt("doctorId"));
                doctor.setName(resultSet.getString("name"));
                doctor.setSpecialization(resultSet.getString("specialization"));
                doctor.setPhone(resultSet.getString("phone"));
                doctor.setEmail(resultSet.getString("email"));

                //using toString method to display the doctor details
                System.out.println(doctor);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void viewDoctorById(){

        String str="select * from doctor where doctorId=?";

        try{
            Connection connection= ConnectionDetails.establishConnection();

            PreparedStatement preparedStatement= connection.prepareStatement(str);
            preparedStatement.setInt(1,scanner.nextInt());

            ResultSet resultSet= preparedStatement.executeQuery();

            while(resultSet.next()){

                //Object to set the values to the doctor object
                Doctor doctor=new Doctor();

                doctor.setDoctorId(resultSet.getInt("doctorId"));
                doctor.setName(resultSet.getString("name"));
                doctor.setSpecialization(resultSet.getString("specialization"));
                doctor.setPhone(resultSet.getString("phone"));
                doctor.setEmail(resultSet.getString("email"));

                //using toString method to display the doctor details
                System.out.println(doctor);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
