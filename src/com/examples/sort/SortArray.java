package com.examples.sort;

import java.lang.String;import java.lang.System;import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 7, 3, 5, 2, 6, 4};

        Arrays.sort(numbers);

        for(int iter = 0; iter < numbers.length; iter++)
            System.out.print(numbers[iter]);
    }
}
