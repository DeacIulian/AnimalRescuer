package org.fasttrackit;

public class Mamifer {
    private double age;
    private int health;
    private int hunger;
    private int mood;
    private double height;
    private double weight;
    private String preferateFood;
    private String activity;
    private String mamiferName;

    //Mamifer name constructor
    public Mamifer(String mamiferName){
        this.mamiferName = mamiferName;
    }

    public void setMamiferName(String name){

        this.mamiferName = name;
    }

    public String getMamiferName(){

        return mamiferName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPreferateFood() {
        return preferateFood;
    }

    public void setPreferateFood(String preferateFood) {
        this.preferateFood = preferateFood;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
