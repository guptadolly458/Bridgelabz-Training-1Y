package com.hospital;

import java.util.*;

public class HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\n1. In-Patient  2. Out-Patient");
            int choice = sc.nextInt();

            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            Patient p;

            if (choice == 1) {
                System.out.print("Enter Days Admitted: ");
                int days = sc.nextInt();
                p = new InPatient(id, name, age, days);
            } else {
                p = new OutPatient(id, name, age);
            }

            sc.nextLine();
            System.out.print("Enter Medical Record: ");
            String record = sc.nextLine();

            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                m.addRecord(record);
            }

            patients.add(p);
        }
        System.out.println("\n--- Patient Details ---");
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                m.viewRecords();
            }

            System.out.println("---------------------------");
        }
    }
}