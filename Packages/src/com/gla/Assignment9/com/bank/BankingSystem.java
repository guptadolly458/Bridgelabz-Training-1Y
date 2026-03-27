package com.bank;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\n1. Savings Account  2. Current Account");
            int choice = sc.nextInt();

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount acc;

            if (choice == 1) {
                acc = new SavingsAccount(accNo, name, balance);
            } else {
                acc = new CurrentAccount(accNo, name, balance);
            }
            System.out.print("Enter amount to deposit: ");
            acc.deposit(sc.nextDouble());
            System.out.print("Enter amount to withdraw: ");
            acc.withdraw(sc.nextDouble());
            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                System.out.print("Enter loan amount to apply: ");
                l.applyForLoan(sc.nextDouble());
            }

            accounts.add(acc);
        }
        System.out.println("\n--- Account Details ---");
        for (BankAccount acc : accounts) {
            acc.displayDetails();
        }
    }
}