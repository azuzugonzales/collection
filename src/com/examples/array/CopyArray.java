package com.examples.array;

import java.lang.String;import java.lang.System;import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 6};
        int[] figures = Arrays.copyOf(numbers, numbers.length);

        figures[2] = 30;
        System.out.println(numbers[2]);
        System.out.println(figures[2]);
    }
}
