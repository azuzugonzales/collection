package com.examples.dotnetperls.average.exampl05;

public class Void {
    static void test(int value) {
        if (value == 0) {
            // A void method has no return value.
            // ... We use an empty return statement.
            return;
        }
        System.out.println(value);
        // A return statement is automatically added here.
    }

    public static void main(String[] args) {

        // No variables can be assigned to a void method call.
        test(0);    // No effect.
        test(1);
        test(2);
    }
}
