package com.rental;

import java.util.*;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\n1. Car  2. Bike  3. Truck");
            int choice = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter Vehicle Number: ");
            String number = sc.nextLine();

            System.out.print("Enter Rental Rate per Day: ");
            double rate = sc.nextDouble();

            Vehicle v;

            if (choice == 1) {
                v = new Car(number, rate);
            } else if (choice == 2) {
                v = new Bike(number, rate);
            } else {
                v = new Truck(number, rate);
            }

            vehicles.add(v);
        }

        System.out.print("\nEnter number of rental days: ");
        int days = sc.nextInt();

        // Polymorphism
        System.out.println("\n--- Vehicle Details ---");
        for (Vehicle v : vehicles) {
            v.displayDetails(days);
        }
    }
}