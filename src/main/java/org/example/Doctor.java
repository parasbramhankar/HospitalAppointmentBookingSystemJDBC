package org.example;

public class Doctor {
    private int doctorId;
    private String name;
    private Specialization specialization;
    private String phone;
    private String email;


    public Doctor(int doctorId, String name, Specialization specialization, String phone, String email) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Doctor: " +
                "doctorId=" + doctorId +
                ", name='" + name + '\'' +
                ", specialization=" + specialization +
                ", phone='" + phone + '\'' +
                ", email='" + email ;
    }
}
