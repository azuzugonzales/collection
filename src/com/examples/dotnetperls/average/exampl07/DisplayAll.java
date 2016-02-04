package com.examples.dotnetperls.average.exampl07;

public class DisplayAll {
    static void displayAll(int... test) {
        // The argument is an int arrayother.
        for (int value : test) {
            System.out.println(value);
        }
        System.out.println("DONE");
    }

    public static void main(String[] args) {
        // Pass variable argument lists to displayAll method.
        displayAll(10, 20, 30, 40);
        displayAll(0);
        displayAll();
    }
}
