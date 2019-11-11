package org.fasttrackit;

public class Adopter {
    private String adopterName;
    private double moneyAmount;

    //Constructor for Adopter
    //public Adopter(double moneyAmount) {
    //    this.moneyAmount = moneyAmount;
    //}

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

    //Creating a method which the Adopter give food to the Animal

    public void feeding(Animal animal, AnimalFood animalFood) {

        System.out.println(getName() + " just gave some " + animalFood.getFoodName() + " food " +
                " to " + animal.getAnimalName());
        if (animal.getHunger() >= 0) {
            animal.setHunger(animal.getHunger() - 1);
        }


        if (animalFood.getFoodName().equals(animal.getFavoriteFood())) {
                animal.setMood(animal.getMood() + 1);
                if(animal.getMood() <= 10) {
                    System.out.println(animalFood.getFoodName() + " is " + animal.getAnimalName() +
                            "'s favorite food. Mood level: " + animal.getMood());
                }else{
                    System.out.println(animalFood.getFoodName() + " is " + animal.getAnimalName() +
                            "'s favorite food. Mood level: 10");
                }


        }


        System.out.println("Hunger level : " + animal.getHunger());

    }

    public void recreationActivity(Animal animal, Activity activity) {
        System.out.println(getName() + " is going for  " + activity.getActivityName() + " with "
                + animal.getAnimalName() + " tonight ");
        if (animal.getFavoriteActivity().equals(activity.getActivityName())) {

                animal.setMood(animal.getMood() + 2);
                if(animal.getMood() <= 10) {
                    System.out.println(animal.getFavoriteActivity() + " is " + animal.getAnimalName() +
                            "'s favorite activity. Mood level: " + animal.getMood());
                }else{
                    System.out.println(animal.getFavoriteActivity() + " is " + animal.getAnimalName() +
                            "'s favorite activity. Mood level: 10");
                }
        } else {

                animal.setMood(animal.getMood() + 1);
                if(animal.getMood() <= 10) {
                    System.out.println("Mood level: " + animal.getMood());
                }else {
                    System.out.println("Mood level: 10");
                }
        }
    }
}
