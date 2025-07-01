package org.example;

public class Specialization {

    private int specializationId;
    private String name;

    public Specialization(int specializationId, String name) {
        this.specializationId = specializationId;
        this.name = name;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(int specializationId) {
        this.specializationId = specializationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Specialization: " +
                "specializationId=" + specializationId +
                ", name='" + name;
    }
}
