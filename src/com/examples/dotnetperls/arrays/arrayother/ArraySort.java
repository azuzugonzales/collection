package com.examples.dotnetperls.arrays.arrayother;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] array = { 100, 20, 0, 200 };

        // Call Arrays.sort on the int arrayother.
        Arrays.sort(array);

        for (int elem : array) {
            System.out.println(elem);
        }
    }
}
