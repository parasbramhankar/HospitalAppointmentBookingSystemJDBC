package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to Hospital Appointment Booking System");
        System.out.println("Please select your role:");
        System.out.println("1. Admin");
        System.out.println("3. Doctor");
        System.out.println("3. Patient");
        System.out.print("Enter your choice (1,2 or 3): ");

        int choice= scanner.nextInt();

        switch (choice){

            case 1:
                   AdminService adminOperation=new AdminService();
                   adminOperation.operations();
                   break;
            case 2:
                  DoctorService doctorService=new DoctorService();

                break;
            case 3:
                PatientService patientService=new PatientService();
                break;
        }
    }
}
