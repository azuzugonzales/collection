package com.examples.dotnetperls.overload;

public class Overload {

    public static void action(int value) {
        System.out.println("Int = " + Integer.toString(value));
    }

    public static void action(String value) {
        System.out.println("Length = " + value.length());
    }

    public static void main(String[] args) {

        // Call with Integer argument.
        action(1);

        // Call with String argument
        action("cat");
    }
}
