package com.company.main;

import com.company.hr.*;
import com.company.payroll.*;

public class MainApp {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Dolly", 50000);
        Payroll p = new Payroll();

        double total = p.calculateBonus(e);

        System.out.println(e.getName());
        System.out.println("Salary with Bonus: " + total);
    }
}