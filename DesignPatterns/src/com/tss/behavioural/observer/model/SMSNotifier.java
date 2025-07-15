package com.tss.behavioural.observer.model;

public class SMSNotifier implements INotifier {
    @Override
    public void sendNotification(String message, double amount) {
        System.out.println("SMS: " + message + " | Amount: ₹" + amount);
    }
}
