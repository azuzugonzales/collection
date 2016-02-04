package com.examples.dotnetperls.arrays.arrayother;

import java.util.Arrays;

public class ArrayCopyOf {
    public static void main(String[] args) {

        int[] values = { 10, 20, 30, 40 };

        // Copy and display first 3 elements.
        int[] copy = Arrays.copyOf(values, 3);
        for (int value : copy) {
            System.out.println(value);
        }
        System.out.println();

        // Copy five elements.
        int[] copy2 = Arrays.copyOf(values, 5);
        for (int value : copy2) {
            System.out.println(value);
        }
    }
}
