package org.fasttrackit;

public class Cat extends Animal{

    private String breed;

    //Constructor for super class name
    public Cat(String animalName) {
        super(animalName);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void animalMoodRate(int animalMood) {

        if (animalMood > 7) {
            System.out.println("The cat is happy and is purring.");
        } else {
            System.out.println("You need to give more affection for your cat!");
        }

    }
}
