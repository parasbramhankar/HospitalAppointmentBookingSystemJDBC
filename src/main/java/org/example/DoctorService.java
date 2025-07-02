package org.example;

import org.example.AppointmentRelatedOperations.UpdateAppointmentStatus;
import org.example.DoctorRelatedOperations.ViewAppointmentScheduled;
import org.example.DoctorRelatedOperations.ViewPatientDetailsForDoctor;

import java.util.Scanner;

public class DoctorService {

    public void doctorOperation(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Perform Operations: ");
        System.out.println("1. View appointments scheduled");
        System.out.println("2. View Patient details allotted");
        System.out.println("3. Update the Status of the appointment");
        int choice= scanner.nextInt();

        switch (choice){
            case 1: //view appointment schedules
                ViewAppointmentScheduled viewAppointmentScheduled=new ViewAppointmentScheduled();
                viewAppointmentScheduled.displayAppointmentByDoctorId();
                break;
            case 2: // view patient details for their appointment
                ViewPatientDetailsForDoctor viewPatientDetailsForDoctor=new ViewPatientDetailsForDoctor();
                viewPatientDetailsForDoctor.viewPatientDetailsByDoctorId();
                break;
            case 3: //
                UpdateAppointmentStatus updateAppointmentStatus=new UpdateAppointmentStatus();
                updateAppointmentStatus.updateAppointment();
        }
    }

}
