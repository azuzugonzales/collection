package com.examples.oop.bisycleacme;

import java.util.Random;

public class ACMEBicycle implements Bisycle {

    Random randomGen = new Random();
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }
    public void changeGear(int newValue) {

    }
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    void printStates() {
        System.out.println("casence: " +
        cadence + " speed: " +
        speed + " gear: " + gear);
    }

    public void changeCadenceCurrent(int newValue) {
        cadence = cadence + randomGen.nextInt(3_00);
    }


    public static void main(String[] args) {
        ACMEBicycle acme = new ACMEBicycle();

        acme.printStates();
        acme.changeCadenceCurrent(1);
        acme.printStates();
        System.out.println(acme.cadence);

    }
}
