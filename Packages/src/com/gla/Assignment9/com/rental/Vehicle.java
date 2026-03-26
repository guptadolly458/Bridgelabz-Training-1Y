package com.rental;

public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String number, String type, double rate) {
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public void displayDetails(int days) {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Cost: " + calculateRentalCost(days));

        if (this instanceof Insurable) {
            Insurable i = (Insurable) this;
            System.out.println("Insurance: " + i.calculateInsurance());
            System.out.println(i.getInsuranceDetails());
        }

        System.out.println("---------------------------");
    }
}