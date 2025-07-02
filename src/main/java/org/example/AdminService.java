package org.example;

import org.example.AppointmentRelatedOperations.DeleteAppointment;
import org.example.AppointmentRelatedOperations.UpdateAppointmentStatus;
import org.example.AppointmentRelatedOperations.ViewAllAppointment;
import org.example.DoctorRelatedOperations.AddNewDoctor;
import org.example.DoctorRelatedOperations.ViewDoctorDetails;
import org.example.PatientRelatedOperation.AddNewPatient;
import org.example.PatientRelatedOperation.UpdatePatientDetails;
import org.example.PatientRelatedOperation.ViewPatientDetails;
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
        System.out.println("8. Create the tables of Patient,Doctor,Appointment");
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

               System.out.println("Doctor details by id");
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
               ViewPatientDetails viewDetails=new ViewPatientDetails();
               viewDetails.viewAllPatientDetails();

               System.out.println("Patient details by name: ");
               viewDetails.viewPatientDetailsByName();

           }
           case 6->{
                 //Update appointment status (booked, cancel, Completed)
               UpdateAppointmentStatus updateAppointmentStatus=new UpdateAppointmentStatus();
               updateAppointmentStatus.updateAppointment();

           }
           case 7->{
               ViewAllAppointment viewAllAppointment=new ViewAllAppointment();
               viewAllAppointment.displayAppointment();
           }
           case 9->{
               DeleteAppointment deleteAppointment=new DeleteAppointment();
               deleteAppointment.deleteAppointment();
           }
           case 8->{
               //create all the table
                CreateTables createTable=new CreateTables();
                createTable.createDoctorTable();
                createTable.createPatientTable();
                createTable.createAppointmentTable();
            }
        }

    }
}
