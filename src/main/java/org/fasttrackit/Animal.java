package org.fasttrackit;

public class Animal  {
    private String animalName;
    private double animalAge;
    private int health;
    private int hunger;
    private int mood;
    private String favoriteFood;
    private String favoriteActivity;

    //Constructor for Animal class
    public Animal(String animalName) {
        this.animalName = animalName;
    }

    //Encapsulating atributes for Animal class
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

    public String getFavoriteFood() {

        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {

        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {

        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {

        this.favoriteActivity = favoriteActivity;
    }

    public String getAnimalName() {

        return animalName;
    }

    public void setAnimalName(String animalName) {

        this.animalName = animalName;
    }

    public double getAnimalAge() {

        return animalAge;
    }

    public void setAnimalAge(double animalAge) {

        this.animalAge = animalAge;
    }

    public void animalMoodRate(int animalMood) {

        if (animalMood > 7) {
            System.out.println(getAnimalName() + " is feeling very well!");
        }else {
            System.out.println(getAnimalName() + " need more affection.");
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalAge=" + animalAge +
                ", health=" + health +
                ", hunger=" + hunger +
                ", mood=" + mood +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                '}';
    }
}
