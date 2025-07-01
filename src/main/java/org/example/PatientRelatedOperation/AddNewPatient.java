package org.example.PatientRelatedOperation;

public class AddNewPatient {

    public void addNewPatient(){

        String sql = "INSERT INTO patient (patientId, name, gender, age, phone, email, address) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";



    }
}
