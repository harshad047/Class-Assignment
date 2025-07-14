package com.tss.structural.proxy.model;

public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount = new RealBankAccount();

    @Override
    public void withdraw(String user, String pin, double amount) {
        if (authenticate(user, pin)) {
            System.out.println("Authentication successful for user: " + user);
            realBankAccount.withdraw(user, pin, amount);
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }

    private boolean authenticate(String user, String pin) {
        // Simple mock check for demo purposes
        return "1234".equals(pin);
    }
}