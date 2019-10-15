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

        Animal animal = new Animal("Rex");
        animal.setAge(3.5);
        animal.setHealth(8);
        animal.setHunger(9);
        animal.setMood(3);
        animal.setPreferateFood("Pedigree");
        animal.setActivity("Frizbee");
        animal.setType("Domestic");
        animal.setNumberOfFeets(4);

        Adopter adopter = new Adopter();
        adopter.setName("Mihai");
        adopter.setMoneyAmount(274.38);

        AnimalFood animalFood = new AnimalFood("Chicken");
        animalFood.setName("Pedigree");
        animalFood.setPrice(21.99);
        animalFood.setQuantity(15);
        animalFood.isAvailability(true);
        animalFood.setExpirationDate(date);

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Dr. Popescu");
        veterinarian.setSpecialization("Dogs");

        Game game = new Game();
        game.adopter = adopter;
        game.dog = animal;
        game.veterinarian = veterinarian;

        System.out.println(animalFood.getExpirationDate());
        System.out.println(animalFood.getAvailability());

        adopter.feeding(animal, animalFood);
        adopter.recreationActivity(animal);
    }
}
