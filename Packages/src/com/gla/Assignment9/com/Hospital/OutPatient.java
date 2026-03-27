package com.hospital;

import java.util.*;

public class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 500; 
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