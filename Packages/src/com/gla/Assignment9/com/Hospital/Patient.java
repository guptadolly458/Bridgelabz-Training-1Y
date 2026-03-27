package com.hospital;

public abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;package com.hospital;

