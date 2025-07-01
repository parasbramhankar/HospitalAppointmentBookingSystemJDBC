package org.example.TableCreation;

import org.example.ConnectionDetails;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
                "patientId INT PRIMARY KEY, " +
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


    public void createAppointmentTable() {

        String sql = "CREATE TABLE appointment (" +
                "appointmentId SERIAL PRIMARY KEY, " +
                "doctorId INT REFERENCES doctor(doctorId) ON DELETE CASCADE, " +
                "patientId INT REFERENCES patient(patientId) ON DELETE CASCADE, " +
                "date DATE NOT NULL, " +
                "time TIME NOT NULL, " +
                "status VARCHAR(20) CHECK (status IN ('Booked', 'Completed', 'Cancelled'))" +
                ");";

        try {
            Connection connection = ConnectionDetails.establishConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            int n = preparedStatement.executeUpdate();

            if (n == 0) {
                System.out.println("Appointment table created successfully");
            }
        }catch (IOException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
