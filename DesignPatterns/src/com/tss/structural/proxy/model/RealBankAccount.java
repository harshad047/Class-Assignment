package com.tss.structural.proxy.model;

public class RealBankAccount implements BankAccount {
    private double balance = 1000.0;

    @Override
    public void withdraw(String user, String pin, double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}