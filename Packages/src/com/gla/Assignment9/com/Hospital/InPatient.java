package com.hospital;

import java.util.*;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();

    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.daysAdmitted = days;
    }

    public double calculateBill() {
        return daysAdmitted * 2000; // per day cost
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}