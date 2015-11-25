package com.examples.oop;

public class Algorithm {

    public final static double PI = 3.14;

    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
    public static int fibonachi(int x) {
        if (x == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        } else {
            return fibonachi(x - 1) + fibonachi(x - 2);
        }
    }

}
