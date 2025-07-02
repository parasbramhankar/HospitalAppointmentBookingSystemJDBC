package org.example;

import org.example.AppointmentRelatedOperations.BookAppointment;
import org.example.AppointmentRelatedOperations.DeleteAppointment;
import org.example.AppointmentRelatedOperations.RescheduledAppointmentId;
import org.example.PatientRelatedOperation.AddNewPatient;

import java.util.Scanner;

public class PatientService {

    public void performOperations(){
        System.out.println("Enter: ");
        System.out.println("1. Registration: ");
        System.out.println("2. Book An appointment: ");
        System.out.println("3. cancel the appointment: ");
        System.out.println("4. reschedule the appointment: ");
        System.out.println("5. view Appointment history: ");
        System.out.println("6. view and edit the personal details: ");
        Scanner scanner=new Scanner(System.in);
        int choice= scanner.nextInt();

        switch (choice){
            case 1->{
                AddNewPatient addNewPatient=new AddNewPatient();
                addNewPatient.addNewPatient();
            }
            case 2->{
                //book an appointment
                BookAppointment bookAppointment=new BookAppointment();
                bookAppointment.bookAppointment();
            }
            case 3->{
                //cancel the appointment
                DeleteAppointment deleteAppointment=new DeleteAppointment();
                deleteAppointment.deleteAppointment();

            }
            case 4->{
//                reschedule the appointment:
                RescheduledAppointmentId rescheduledAppointmentId=new RescheduledAppointmentId();
                rescheduledAppointmentId.rescheduleAppointment();

            }
            case 5->{
                //Display appointment history


            }
        }
    }


}
