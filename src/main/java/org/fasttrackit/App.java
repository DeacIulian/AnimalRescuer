package org.fasttrackit;

/**
 * Hello world!
 *
 */

import java.text.SimpleDateFormat;
import java.util.*;

public class App 
{
    public static void main( String[] args ) throws Exception
    {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String expiryDate = "28/11/2020";
        Date date = sdf.parse(expiryDate);

        Animal animal1 = new Animal("Rex");
        animal1.setAnimalAge(3.5);
        animal1.setHealth(8);
        animal1.setHunger(9);
        animal1.setMood(3);
        animal1.setFavoriteFood("Pedigree");
        animal1.setFavoriteActivity("Frizbee");

        Animal dog1 = new Dog("Lord");
        dog1.setAnimalAge(3);
        dog1.setFavoriteActivity("Running");
        dog1.setFavoriteFood("Bones");
        dog1.setHealth(8);
        dog1.setHunger(6);
        dog1.setMood(8);

        Animal cat1 = new Cat("Sisi");
        cat1.setAnimalAge(2);
        cat1.setFavoriteActivity("Playing with ball");
        cat1.setFavoriteFood("Purrina");
        cat1.setHealth(7);
        cat1.setHunger(5);
        cat1.setMood(6);
        Adopter adopter = new Adopter(250);
        adopter.setName("Mihai");
        adopter.setMoneyAmount(274.38);

        AnimalFood animalFood = new AnimalFood("Chicken");
        animalFood.setFoodName("Pedigree");
        animalFood.setPrice(21.99);
        animalFood.setQuantity(15);
        animalFood.isAvailability(true);
        animalFood.setExpiryDate(date);

        Veterinarian veterinarian = new Veterinarian("Digestive system");
        veterinarian.setName("Dr. Popescu");



        adopter.feeding(animal1);
        adopter.recreationActivity(animal1);
        adopter.feeding(dog1);
        animal1.animalMoodRate(animal1.getMood());
        dog1.animalMoodRate(dog1.getMood());
        cat1.animalMoodRate(cat1.getMood());
    }
}
