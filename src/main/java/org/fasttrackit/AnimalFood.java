package org.fasttrackit;

public class AnimalFood extends Food {

    private String foodName;

    public AnimalFood(String name){
        this.name = name;
    }

    public void setName(String name){
        foodName = name;
    }

    public String getFoodName(){
        return foodName;
    }

    String taste;

}
