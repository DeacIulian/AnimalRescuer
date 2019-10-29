package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public void start() {


        initiAnimalFood();
        displayAnimalFood();
        initiActivities();
        displayActivities();
    }


    private List<AnimalFood> availableAnimalFood = new ArrayList<>();
    private Activity[] availaleActivities = new Activity[2];

    private void initiAnimalFood() {

        AnimalFood food1 = new AnimalFood("Pedigre");

        availableAnimalFood.add(food1);


        AnimalFood food2 = new AnimalFood("Whiskas");

        availableAnimalFood.add(food2);
    }

    private void initiActivities() {
        Activity activity1 = new Activity("Frisbee");
        activity1.setDurationInMinutes(45);

        availaleActivities[0] = activity1;

        Activity activity2 = new Activity("Running");
        activity2.setDurationInMinutes(30);

        availaleActivities[1] = activity2;
    }

    private void displayAnimalFood() {
        System.out.println("Available animal food is: ");

        for (AnimalFood animalFood: availableAnimalFood) {
            System.out.println(animalFood.getFoodName());
        }
    }

    private void displayActivities() {
        System.out.println("Available activities are: ");

        for (int i = 0; i < availaleActivities.length; i++) {
            System.out.println(availaleActivities[i].getActivityName());
        }
    }
}
