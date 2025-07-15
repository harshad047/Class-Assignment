package com.tss.behavioural.observer.model;

import java.util.ArrayList;
import java.util.List;

import com.tss.behavioural.observer.exception.InsufficientBalanceException;

public class Account {
    private String accountNumber;
    private String name;
    private double balance;
    private List<INotifier> notifiers;

    public Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.notifiers = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot add non-positive amount.");
            return;
        }
        balance += amount;
        notifyAll("Deposited " + amount + ", New Balance: " + balance, amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds to withdraw ₹" + amount);
        }
        balance -= amount;
        notifyAll("Withdrew " + amount + ", New Balance: " + balance, amount);
    }

    public void registerNotifier(INotifier notifier) {
        if (hasNotifier(notifier.getClass())) {
            System.out.println(notifier.getClass().getSimpleName() + " already registered.");
        } else {
            notifiers.add(notifier);
            System.out.println(notifier.getClass().getSimpleName() + " Added.");
        }
    }

    public void removeNotifierByType(Class<? extends INotifier> notifierType) {
        notifiers.removeIf(n -> n.getClass().equals(notifierType));
    }

    public boolean hasNotifier(Class<? extends INotifier> notifierType) {
        for (INotifier notifier : notifiers) {
            if (notifier.getClass().equals(notifierType)) {
                return true;
            }
        }
        return false;
    }

    private void notifyAll(String message, double amount) {
        for (INotifier notifier : notifiers) {
            notifier.sendNotification(message, amount);
        }
    }

    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Name           : " + name);
        System.out.println("Balance        : " + balance);
        System.out.println("Notifiers      : " + notifiers.size());
    }
}
