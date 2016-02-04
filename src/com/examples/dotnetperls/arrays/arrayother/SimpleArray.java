package com.examples.dotnetperls.arrays.arrayother;

public class SimpleArray {
    public static void main(String[] args) {

        // Create int arrayother.
        int[] array = new int[5];

        // Assign first three elements.
        array[0] = 1;
        array[1] = 10;
        array[2] = 100;

        array[4] = 100;

        // Loop over elements
        for (int i = 0; i < array.length; i++) {
            // Get value
            int value = array[i];
            // Print value.
            System.out.println(value);
        }
    }
}
