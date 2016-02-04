package com.examples.dotnetperls.arrays.arrayother;

import java.util.Arrays;

public class ArrayCopyOfRange {
    public static void main(String[] args) {

        int[] values = { 0, 10, 20, 30, 40, 50 };

        // Copy elements from index 2 to 5 (2, 3, 4).
        int[] result = Arrays.copyOfRange(values, 2, 5);
        for (int value : result) {
            System.out.println(value);
        }
    }
}
