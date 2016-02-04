package com.examples.dotnetperls.arrays.array_binary_search;

import java.util.Arrays;

public class ArrayNotFound {
    public static void main(String[] args) {

        int[] values = { 0, 2, 4, 8 };

        // Value does not occur.
        int index = Arrays.binarySearch(values, 400);
        System.out.println(index);
    }
}
