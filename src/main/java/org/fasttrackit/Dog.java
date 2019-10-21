package org.fasttrackit;

public class Dog extends Animal{

    private boolean trained;

    //Constructor for super class name
    public Dog(String animalName) {
        super(animalName);
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public void animalMoodRate(int animalMood) {

        if (animalMood > 7) {
            System.out.println("The dog is happy and is moving his tail.");
        } else {
            System.out.println("You need to play more with your dog!");
        }

    }

}
