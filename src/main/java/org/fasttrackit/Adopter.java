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

        if (animal.getFavoriteFood() == animalFood.getFoodName()) {

            animal.setMood(animal.getMood() + 1);
            System.out.println(animalFood.getFoodName() + " is " + animal.getAnimalName() +
                    "'s preferate food. Mood level: " + animal.getMood());

        }

        System.out.println("Hunger level : " + animal.getHunger());

    }

    public void recreationActivity(Animal animal, Activity activity) {
        System.out.println(getName() + " is going for  " + activity.getActivityName() + " with "
                + animal.getAnimalName() + " tonight ");
        if (animal.getFavoriteActivity() == activity.getActivityName()) {

            animal.setMood(animal.getMood() + 2);
            System.out.println(animal.getFavoriteActivity() + " is " + animal.getAnimalName() +
                    "'s favorite activity. Mood level: " + animal.getMood());
        }else {

            animal.setMood(animal.getMood() + 1);
            System.out.println("Mood level: " + animal.getMood());
        }
    }
}
