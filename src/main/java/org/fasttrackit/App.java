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

        Animal animal = new Animal();
        animal.name = "Rex";
        animal.age = 2.6;
        animal.health = 6;
        animal.hunger = 9;
        animal.mood = 3;
        animal.preferateFood = "Pedigree";
        animal.activity = "Frisbee";
        animal.type = "Domestic";
        animal.numberOfFeets = 4;

        Adopter adopter = new Adopter();
        adopter.name = "Mihai";
        adopter.moneyAmount = 250.74;

        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Pedigree";
        animalFood.price = 21.99;
        animalFood.quantity = 15;
        animalFood.availability = true;
        animalFood.expirationDate = date;
        animalFood.taste = "Chicken";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Dr. Popescu";
        veterinarian.specialization = "Dogs";

        Game game = new Game();
        game.adopter = adopter;
        game.dog = animal;
        game.veterinarian = veterinarian;

        System.out.println(animalFood.expirationDate);
    }
}
