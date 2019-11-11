package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    Adopter rescuer = new Adopter();
    Dog animal = new Dog();
    AnimalFood animalFood = new AnimalFood();
    Activity activity = new Activity();

    public void start() throws Exception {


        initRescuer();
        nameAnimal();
        initAnimal();
        initAnimalFood();
        initActivities();

        boolean round = true;
        while (round) {
            requireFeeding();
            requireActivity();
            if(animal.getHunger() < 1 && animal.getMood() >= 10){
                round = false;
                System.out.println("CONGRATULATIONS! Your animal is very happy now. You won the game!");
                break;
            }
        }

    }


    private List<AnimalFood> availableAnimalFood = new ArrayList<>();
    private Activity[] availaleActivities = new Activity[4];

    private void initAnimalFood() {

        AnimalFood food1 = new AnimalFood();
        food1.setFoodName("Beans");
        availableAnimalFood.add(food1);

        AnimalFood food2 = new AnimalFood();
        food2.setFoodName("Chicken");
        availableAnimalFood.add(food2);

        AnimalFood food3 = new AnimalFood();
        food3.setFoodName("Fish");
        availableAnimalFood.add(food3);

        AnimalFood food4 = new AnimalFood();
        food4.setFoodName("Bones");
        availableAnimalFood.add(food4);
    }

    private void initActivities() {
        Activity activity1 = new Activity();
        activity1.setActivityName("Frisbee");
        activity1.setDurationInMinutes(45);
        availaleActivities[0] = activity1;

        Activity activity2 = new Activity();
        activity2.setActivityName("Running");
        activity2.setDurationInMinutes(30);
        availaleActivities[1] = activity2;

        Activity activity3 = new Activity();
        activity3.setActivityName("Swimming");
        activity3.setDurationInMinutes(35);
        availaleActivities[2] = activity3;

        Activity activity4 = new Activity();
        activity4.setActivityName("Sleeping");
        activity4.setDurationInMinutes(60);
        availaleActivities[3] = activity4;

    }

    private void displayAnimalFood() {
        System.out.println("Available animal food is: ");

        for (AnimalFood animalFood : availableAnimalFood) {
            System.out.println(animalFood.getFoodName());
        }
    }

    private void displayActivities() {
        System.out.println("Available activities are: ");

        for (int i = 0; i < availaleActivities.length; i++) {
            System.out.println(availaleActivities[i].getActivityName());
        }
    }

    //........Method for initializing animal........


    private void initAnimal() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Choose a favorite food for your animal: ");
        String favFood = scanner.nextLine();

        System.out.println("Choose a favorite activity for your animal: ");
        String favActivity = scanner.nextLine();


        //Attributing to object the choose properties


        animal.setFavoriteFood(favFood);
        animal.setFavoriteActivity(favActivity);
        animal.setAnimalAge(ThreadLocalRandom.current().nextInt(0, 5));
        animal.setHealth(ThreadLocalRandom.current().nextInt(5, 8));
        animal.setHunger(ThreadLocalRandom.current().nextInt(5, 8));
        animal.setMood(ThreadLocalRandom.current().nextInt(5 , 8));

        System.out.println("Animal's age: " + animal.getAnimalAge());
        System.out.println("Animal's health: " + animal.getHealth());
        System.out.println("Animal's hunger: " + animal.getHunger());
        System.out.println("Animal's mood: " + animal.getMood());
        System.out.println("Animal's favorite food is " + animal.getFavoriteFood());
        System.out.println("Animal's favorite activity is " + animal.getFavoriteActivity());

    }


    //..............Method for initializing rescuer..........

    private void initRescuer() {

        System.out.println("Please enter your name.");

        Scanner scanner = new Scanner(System.in);

        String newName = scanner.nextLine();

        if (newName.matches("[a-zA-z]+") && newName.length() > 0) {//Verifying if the string contains only letters
            rescuer.setName(newName);
            System.out.println("Adopter name: " + rescuer.getName());

        } else {
            System.out.println("You entered an invalid value wich doesn't contain only letters. Try again!");
            initRescuer();
        }
    }

    //...........Method for naming animal..........

    private void nameAnimal() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a name for your animal.");

        String newAnimalName = scanner.nextLine();

        if (newAnimalName.matches("[a-zA-Z]+") && newAnimalName.length() > 0) {

            animal.setAnimalName(newAnimalName);
            System.out.println("Your animal name is " + animal.getAnimalName());
        } else {

            System.out.println("You entered an invalid value which doesn't contain only letters. Try again!");
            nameAnimal();
        }
    }


    //......Method for requiring feeding.......

    private void requireFeeding() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your animal is hungry. Choose something to eat from the below list: ");

        for (AnimalFood animalFood : availableAnimalFood) {
            System.out.println(animalFood.getFoodName());
        }

        String newAnimalFood = scanner.nextLine();

        if(newAnimalFood.equals("Beans") || newAnimalFood.equals("beans") || newAnimalFood.equals("Chicken")
            || newAnimalFood.equals("chicken") || newAnimalFood.equals("Fish") || newAnimalFood.equals("fish")
            || newAnimalFood.equals("Bones") || newAnimalFood.equals("bones")){

            animalFood.setFoodName(newAnimalFood);

            rescuer.feeding(animal,animalFood);
        }else {
            System.out.println("You choose a type of food which is not available. Please choose an available one!");
            requireFeeding();
        }


    }

    private void requireActivity() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your animal is bored. Do an activity with him from the below list ");

        for (int i = 0; i < availaleActivities.length; i++) {
            System.out.println(availaleActivities[i].getActivityName());
        }

        String newActivity = scanner.nextLine();

        if(newActivity.equals("Frisbee") || newActivity.equals("frisbee") || newActivity.equals("Running") ||
                newActivity.equals("running") || newActivity.equals("Swimming") || newActivity.equals("swimming") ||
                newActivity.equals("Sleeping") || newActivity.equals("sleeping")){

            activity.setActivityName(newActivity);

            rescuer.recreationActivity(animal,activity);
        }
    }
}



