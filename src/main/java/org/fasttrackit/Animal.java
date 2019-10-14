package org.fasttrackit;

public class Animal extends Mamifer {
    private String type;
    private int numberOfFeets;

    public Animal(String mamiferName) {
        super(mamiferName);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfFeets() {
        return numberOfFeets;
    }

    public void setNumberOfFeets(int numberOfFeets) {
        this.numberOfFeets = numberOfFeets;
    }
}
