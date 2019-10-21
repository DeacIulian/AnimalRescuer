package org.fasttrackit;

public class Adopter {
    private String adopterName;
    private double moneyAmount;

    //Constructor for Adopter
    public Adopter(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getName() {
        return adopterName;
    }

    public void setName(String name) {
        this.adopterName = name;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    //Creating a method wich the Adopter give food to the Animal

    public void feeding(Animal animal, AnimalFood animalFood){
        System.out.println(getName() + " just gave some " + animalFood.getFoodName() + " food " +
                " to " + animal.getAnimalName());
        animal.setHunger(animal.getHunger() - 1);
        System.out.println("Hunger level : " + animal.getHunger());

    }

    public void recreationActivity(Animal animal, Activity activity) {
        System.out.println(getName() + " is going for  " + activity.getActivityName() + " with "
                + animal.getAnimalName() + " tonight ");
        animal.setMood(animal.getMood() + 1);
        System.out.println("Mood level: " + animal.getMood());
    }
}
