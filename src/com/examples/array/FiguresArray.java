package com.examples.array;

import java.lang.String;import java.lang.System;import java.util.Arrays;

public class FiguresArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        int[] figures = numbers;

        figures[2] = 30;
        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(numbers));
    }
}
