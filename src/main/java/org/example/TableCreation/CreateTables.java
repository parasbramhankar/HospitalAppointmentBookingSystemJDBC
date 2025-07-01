package org.example.TableCreation;

import org.example.ConnectionDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTables {

    public void createDoctorTable(){

        String sql = "CREATE TABLE doctor (" +
                "doctorId INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "specialization VARCHAR(50), " +
                "phone VARCHAR(15), " +
                "email VARCHAR(100)" +
                ")";
        try {
            Connection connection= ConnectionDetails.establishConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            int num=preparedStatement.executeUpdate();

            if(num==0){
                System.out.println(" Doctor table created successfully");
            }
            connection.close();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void createPatientTable(){
        String sql = "CREATE TABLE patient (" +
                "patientId SERIAL PRIMARY KEY, " +
                "name VARCHAR(50) NOT NULL, " +
                "gender VARCHAR(10) NOT NULL CHECK (gender IN ('Male','Female','Other')), " +
                "age INT CHECK (age > 0), " +
                "phone VARCHAR(15), " +
                "email VARCHAR(100) UNIQUE, " +
                "address VARCHAR(100)" +
                ")";

        try{

            Connection connection=ConnectionDetails.establishConnection();
            PreparedStatement preparedStatement= connection.prepareStatement(sql);

            int n=preparedStatement.executeUpdate();

            if(n==0){
                System.out.println(" Patient table created successfully");
            }
            connection.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    public void createAppointmentTable(){

        String str="create table appointment (appointmentId int, doctorId int,patientId int," +
                "date LocalDate, time LocalTime, Status varchar(10)";


    }
}
