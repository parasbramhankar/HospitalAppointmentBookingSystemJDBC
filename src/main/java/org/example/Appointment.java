package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private int appointmentId;
    private int doctorId;
    private int patientId;
    private LocalDate date;
    private LocalTime time;
    private String status;

//    public Appointment(int appointmentId, int doctorId, int patientId, LocalDate date, LocalTime time, String status) {
//        this.appointmentId = appointmentId;
//        this.doctorId = doctorId;
//        this.patientId = patientId;
//        this.date = date;
//        this.time = time;
//        this.status = status;
//    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment: " +
                "appointmentId=" + appointmentId +
                ", doctorId=" + doctorId +
                ", patientId=" + patientId +
                ", date=" + date +
                ", time=" + time +
                ", status='" + status;
    }
}
