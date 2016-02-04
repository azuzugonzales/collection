package com.examples.dotnetperls.core;

public class CoreTest {
    public static void main(String[] args) {

        Core core = new Core();

        int total = core.totalLength("Bowling", "Gold");
        double average = core.averageLength("Gold", "Car");

        System.out.println(total);
        System.out.println(average);
    }
}
