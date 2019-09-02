package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.name = "Rex";
        animal.age = 2.6;
        animal.health = 6;
        animal.hunger = 9;
        animal.mood = 3;
        animal.preferateFood = "Pedigree";
        animal.activity = "Frisbee";

        Adopter adopter = new Adopter();
        adopter.name = "Mihai";
        adopter.moneyAmount = 250.74;

        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Pedigree";
        animalFood.price = 21.99;
        animalFood.quantity = 15;
        animalFood.availability = true;

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Dr. Popescu";
        veterinarian.specialization = "Dogs";

        System.out.println(animal.activity);
    }
}
