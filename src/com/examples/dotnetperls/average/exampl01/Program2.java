package com.examples.dotnetperls.average.exampl01;

public class Program2 {

    public static void action(int value) {
        System.out.println("Int = " + Integer.toString(value));
    }

    public static void action(String value) {
        System.out.println("Length = " + value.length());
    }

    public static void main(String[] args) {

        // Call with Integer argument.
        action(15);

        // Call with String argument
        action("cat");
    }
}
