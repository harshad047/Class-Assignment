package com.tss.behavioural.observer.model;

public class WhatsappNotifier implements INotifier {
    @Override
    public void sendNotification(String message, double amount) {
        System.out.println("WhatsApp: " + message + " | Amount: ₹" + amount);
    }
}
