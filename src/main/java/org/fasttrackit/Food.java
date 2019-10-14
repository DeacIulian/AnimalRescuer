package org.fasttrackit;

import java.util.Date;

public class Food {
    private String name;
    private double price;
    private double quantity;
    private java.util.Date  expirationDate;
    private boolean availability;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void isAvailability(boolean availability) {
        this.availability = availability;
    }
}
