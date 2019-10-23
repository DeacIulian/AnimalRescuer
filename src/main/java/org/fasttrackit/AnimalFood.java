package org.fasttrackit;

import java.util.Date;

public class AnimalFood {

    private String type;
    private String foodName;
    private double price;
    private double quantity;
    private boolean availability;
    private java.util.Date expiryDate;

    //Constructor for AnimalFood class
    public AnimalFood(String foodName) {
        this.foodName = foodName;
    }


    //Encapsulating atributes for Food class
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
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

    public boolean isAvailability() {
        return availability;
    }

    public void isAvailability(boolean availability) {
        this.availability = availability;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AnimalFood{" +
                "foodName='" + foodName + '\'' +
                '}';
    }
}
