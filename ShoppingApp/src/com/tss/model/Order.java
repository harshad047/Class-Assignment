package com.tss.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date date;
    private List<LineItem> items;

    // Constructor used in your ShoppingApp
    public Order(int id) {
        this.id = id;
        this.date = new Date(); // sets to current date
        this.items = new ArrayList<>();
    }

    // Keep your full constructor too (optional)
    public Order(int id, Date date, List<LineItem> items) {
        this.id = id;
        this.date = date;
        this.items = items;
    }

    public void addItem(LineItem item) {
        this.items.add(item);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) { this.date = date; }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) { this.items = items; }

    public double calculateOrderPrice() {
        double total = 0.0;
        for (LineItem item : items) {
            total += item.calculateLineItemCost();
        }
        return total;
    }
}
