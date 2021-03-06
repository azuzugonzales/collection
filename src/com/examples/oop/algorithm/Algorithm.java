package com.examples.oop.algorithm;

public class Algorithm {

    public final static double PI = 3.14;

    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
    public static int fibonacci(int x) {
        if (x == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }

}
