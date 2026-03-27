package com.bank;

public class SavingsAccount extends BankAccount implements Loanable {
    private double loanAmount;

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04; 
    }

    public void applyForLoan(double amount) {
        this.loanAmount = amount;
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}