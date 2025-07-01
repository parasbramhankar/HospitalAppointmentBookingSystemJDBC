package org.example;

import java.util.Scanner;

public class AdminService {
    Scanner scanner=new Scanner(System.in);

    void operations(){
        System.out.println("Enter: ");
        System.out.println("Which operations do you want to perform ?: ");

        System.out.println("1. Add new doctor & assign Specialization");
        System.out.println("2. View all doctors & there details");
        System.out.println("3. Register a new patient ");
        System.out.println("4. Update patient details ");
        System.out.println("5. Book appointment on behalf of the patient ");
        System.out.println("6. cancel or delete appointment ");
        System.out.println("7. Update appointment status(booked,cancel,Completed)");
        System.out.println("8. view appointment history of any patient");

        System.out.print("");

    }
}
