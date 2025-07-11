package com.tss.structural.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<IItems> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItemsToCart(IItems item) {
        items.add(item);
    }

    public List<IItems> getCartItems() {
        return items;
    }

    public double getCartPrice() {
        double total = 0;
        for (IItems item : items) {
            total += item.getItemPrice();
        }
        return total;
    }

    public void displayCart() {
    	System.out.printf("%-5s %-20s %10s\n", "Sr.", "Item Name", "Price");
        System.out.println("------------------------------------------");
        int srNo = 1;
        for (IItems item : items) {
            System.out.printf("%-5d %-20s %10.2f\n", srNo++, item.getItemName(), item.getItemPrice());
        }
        System.out.println("------------------------------------------");
        System.out.printf("%-25s %10.2f\n", "Total:", getCartPrice());
    }
}
