package org.fasttrackit;

public class Adopter {
    private String name;
    private double moneyAmount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    //Creating a method wich the Adopter give food to the Animal

    public void feeding(Mamifer mamifer, Food food){
        System.out.println(getName() + " just gave some " + food.getName() + " food " +
                " to " + mamifer.getMamiferName());
        mamifer.setHunger(mamifer.getHunger() - 1);
        System.out.println("Hunger level : " + mamifer.getHunger());

    }

    public void recreationActivity(Mamifer mamifer) {
        System.out.println(getName() + " is going for  " + mamifer.getActivity() + " with "
                + mamifer.getMamiferName() + " tonight ");
        mamifer.setMood(mamifer.getMood() + 1);
        System.out.println("Mood level: " + mamifer.getMood());
    }
}
