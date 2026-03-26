package com.employee;

import java.util.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\n1. Full-Time  2. Part-Time");
            int choice = sc.nextInt();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            Employee e;

            if (choice == 1) {
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                e = new FullTimeEmployee(id, name, salary);
            } else {
                System.out.print("Enter Rate per Hour: ");
                double rate = sc.nextDouble();

                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();

                e = new PartTimeEmployee(id, name, rate, hours);
            }

            sc.nextLine();
            System.out.print("Enter Department: ");
            e.assignDepartment(sc.nextLine());

            employees.add(e);
        }
        System.out.println("\n--- Employee Details ---");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}