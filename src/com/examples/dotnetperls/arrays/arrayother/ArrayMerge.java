package com.examples.dotnetperls.arrays.arrayother;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {

        int[] values1 = { 10, 20, 30 };
        int[] values2 = { 100, 200, 300 };

        // Merge the two arrays with for-loops.
        int[] merge = new int[values1.length + values2.length];
        for (int i = 0; i < values1.length; i++) {
            merge[i] = values1[i];
        }
        for (int i = 0; i < values2.length; i++) {
            merge[i + values1.length] = values2[i];
        }

        // Display the merged arrayother.
        System.out.println(Arrays.toString(merge));
    }
}
