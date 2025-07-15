package com.tss.behavioural.observer.model;

public class EmailNotifier implements INotifier {
    @Override
    public void sendNotification(String message, double amount) {
        System.out.println("Email: " + message + " | Amount: ₹" + amount);
    }
}

