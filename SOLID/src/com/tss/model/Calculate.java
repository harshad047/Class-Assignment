package com.tss.model;

import com.tss.model.InvoiceSolid;

public class Calculate {
    public static final double TAX_PERCENT = 10.0;

   
    public double calculateDiscount(InvoiceSolid invoice) {
        return invoice.getCost() * invoice.getDiscountPercent() / 100;
    }
    
    public double calculateTax(InvoiceSolid invoice) {
    	double discounted_price = invoice.getCost()-calculateDiscount(invoice);
        return (discounted_price * TAX_PERCENT)/100;
    }


    public double calculateFinalCost(InvoiceSolid invoice) {
    	double discounted_price = invoice.getCost()-calculateDiscount(invoice);
        return	discounted_price + calculateTax(invoice);
    }
}
