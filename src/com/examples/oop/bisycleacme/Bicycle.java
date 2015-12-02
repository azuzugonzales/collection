package com.examples.oop.bisycleacme;

interface Bisycle {
    // wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);
    void applyBrakes(int decrement);
}
