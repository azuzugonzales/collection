package com.examples.dotnetperls.arrays.array_binary_search;

import java.util.Arrays;

public class ArrayBinarySearch1 {

    public static void main(String[] args) {

        // A presorted arrayother.
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Find value 8.
        int index = Arrays.binarySearch(values, 8);

        // Display result.
        System.out.println("Index = " + index);
        System.out.println("Value = " + values[index]);
    }
}
