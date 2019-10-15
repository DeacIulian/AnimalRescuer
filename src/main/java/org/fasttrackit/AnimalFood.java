package org.fasttrackit;

public class AnimalFood extends Food {

    private String taste;

    //Constructor for AnimalFood class

    public AnimalFood(String taste){
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
