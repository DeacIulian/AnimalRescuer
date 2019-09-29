package org.fasttrackit;

public class Animal extends Mamifer{

    private String animalName;

    public Animal(String animalName){
        this.name = animalName;
    }

    public void setAnimalName(String name){
        animalName = name;
    }

    public String getAnimalName(){
        return animalName;
    }


    String type;
    int numberOfFeets;
}
