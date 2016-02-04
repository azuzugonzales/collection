package com.examples.dotnetperls.arrays.arrayother;

import java.util.Arrays;

public class ArrayFill {
    public static void main(String[] args) {

        int[] values = new int[10];

        // Fill arrayother with this number.
        Arrays.fill(values, 5);

        for (int value : values) {
            System.out.print(value);
            System.out.print(' ');
        }
    }
}
