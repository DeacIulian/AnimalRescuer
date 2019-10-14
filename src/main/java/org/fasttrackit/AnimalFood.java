package org.fasttrackit;

public class AnimalFood extends Food {

    private String foodName;

    //Constructor food name
    public AnimalFood(String foodName){
        this.foodName = foodName;
    }

    public void setName(String name){
        foodName = foodName;
    }

    public String getFoodName(){
        return foodName;
    }

    String taste;

}
