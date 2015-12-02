package com.examples.arraylist.exampl01;

public class ThingDemo {
    public static void main(String[] args) {
        ThingContainer blue = new ThingContainer();

        Thing a = new Thing("A", 2);
        Thing b = new Thing("B", 4);

        blue.add(a);
        blue.add(b);

        blue.report();
        System.out.println("A + B = " + blue.total());

        for (Thing tc: blue) {
            System.out.println(tc);
        }
    }
}
