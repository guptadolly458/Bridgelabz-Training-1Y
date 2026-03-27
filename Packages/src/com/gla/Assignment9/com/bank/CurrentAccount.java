package com.bank;

public class CurrentAccount extends BankAccount implements Loanable {
    private double loanAmount;

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02; 
    }

    public void applyForLoan(double amount) {
        this.loanAmount = amount;
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}