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

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String expiryDate1 = "04/05/2022";
        Date date1 = sdf1.parse(expiryDate1);

        Animal animal1 = new Animal("Rex");
        animal1.setAnimalAge(3.5);
        animal1.setHealth(8);
        animal1.setHunger(9);
        animal1.setMood(3);
        animal1.setFavoriteFood("Pedigree");
        animal1.setFavoriteActivity("Frisbee");

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


        Adopter adopter2 = new Adopter(450);
        adopter2.setName("Rafaela");


        Activity activity1 = new Activity("Frisbee");
        activity1.setDurationInMinutes(30);

        AnimalFood animalFood1 = new AnimalFood("Chicken");
        animalFood1.setFoodName("Pedigree");
        animalFood1.setPrice(21.99);
        animalFood1.setQuantity(15);
        animalFood1.isAvailability(true);
        animalFood1.setExpiryDate(date);

        AnimalFood animalFood2 = new AnimalFood("Beef");
        animalFood2.setFoodName("ZOO Plus");
        animalFood2.setPrice(18.99);
        animalFood2.setQuantity(10);
        animalFood2.isAvailability(true);
        animalFood2.setExpiryDate(date1);


        Veterinarian veterinarian = new Veterinarian("Digestive system");
        veterinarian.setName("Dr. Popescu");



        adopter.feeding(animal1, animalFood1);
        adopter.recreationActivity(animal1, activity1);
        adopter2.feeding(dog1, animalFood2);
        animal1.animalMoodRate(animal1.getMood());
        dog1.animalMoodRate(dog1.getMood());
        cat1.animalMoodRate(cat1.getMood());
    }
}
