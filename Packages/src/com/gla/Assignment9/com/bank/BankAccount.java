package com.bank;

public abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    public abstract double calculateInterest();
    public void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());

        if (this instanceof Loanable) {
            Loanable l = (Loanable) this;
            System.out.println("Loan Eligibility: " + l.calculateLoanEligibility());
        }

        System.out.println("---------------------------");
    }
}