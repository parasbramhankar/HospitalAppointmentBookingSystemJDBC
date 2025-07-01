package org.example;

import org.example.DoctorRelatedOperations.AddNewDoctor;
import org.example.DoctorRelatedOperations.ViewDoctorDetails;
import org.example.PatientRelatedOperation.AddNewPatient;
import org.example.PatientRelatedOperation.UpdatePatientDetails;
import org.example.TableCreation.CreateTables;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminService {
    Scanner scanner=new Scanner(System.in);

    void operations()  {
        System.out.println("Enter: ");
        System.out.println("Which operations do you want to perform ?: ");

        System.out.println("1. Add new doctor & assign Specialization");
        System.out.println("2. View all doctors & there details");
        System.out.println("3. Register a new patient ");
        System.out.println("4. Update patient details ");
        System.out.println("5. View patients details");
        System.out.println("6. Update appointment status(booked,cancel,Completed)");
        System.out.println("7. view appointment history of any patient");

        //run this only one time if you are run this code-first time
        System.out.println("9. Create the tables of Patient,Doctor,Appointment");
        int choice= scanner.nextInt();

        switch (choice){
           case 1->{
               AddNewDoctor addNewDoctor=new AddNewDoctor();
               addNewDoctor.addDoctor();
           }
           case 2->{
               //View all doctors
               ViewDoctorDetails viewDoctorDetails=new ViewDoctorDetails();
               viewDoctorDetails.viewDoctors();
               viewDoctorDetails.viewDoctorById();

           }
           case 3->{
               //Register a new patient
               AddNewPatient addNewPatient=new AddNewPatient();
               addNewPatient.addNewPatient();

           }
           case 4->{
               //Update patient details
               UpdatePatientDetails updatePatientDetails=new UpdatePatientDetails();
               updatePatientDetails.updatePatDetails();
           }
           case 5->{
               //view patient details


           }
           case 6->{
                 //Update appointment status(booked,cancel,Completed)


           }
           case 7->{
               //create all the table
                CreateTables createTable=new CreateTables();

                createTable.createDoctorTable();
                createTable.createPatientTable();
                createTable.createAppointmentTable();
            }
        }

    }
}
