package com.employee;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, 0);
        this.ratePerHour = rate;
        this.hoursWorked = hours;
    }

    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}