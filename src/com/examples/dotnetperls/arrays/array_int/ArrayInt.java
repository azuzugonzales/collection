package com.examples.dotnetperls.arrays.array_int;

public class ArrayInt {
    public static void main(String[] args) {

        // Create int array with four elements.
        int[] values = { 10, 20, 30, 40 };
        // ... Loop over the array's elements
        for (int value : values) {
            System.out.println(value);
        }

        // Create int array with three elements in separate statements.
        int[] alternative = new int[3];
        alternative[0] = 100;
        alternative[1] = 200;
        alternative[2] = -100;
        // ... Use for-loop to all elements.
        for (int i = 0; i < alternative.length; i++) {
            System.out.println(alternative[i]);
        }
    }
}
