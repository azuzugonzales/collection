package com.examples.oop.example.western;

public class Villains extends Humans {
    String mustacheColor;
    String hatColor;
    String look;
    int drunkenness;
    int numberOfDamsels;
    Humans damsel;

    public Villains() {
        look = "Mean";
        drunkenness = 0;
        numberOfDamsels = 0;
    }

    public void drinkWhiskey() {
        drunkenness++;
    }

    public int howDrunkAml() {
        return drunkenness;
    }

    public void tieUpDamsel(Humans damsel) {
        this.damsel = damsel;
        numberOfDamsels++;
        System.out.println("The Villian has tied up " + damsel.whatIsYourName());
    }
}
