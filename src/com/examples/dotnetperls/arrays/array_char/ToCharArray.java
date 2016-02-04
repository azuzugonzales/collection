package com.examples.dotnetperls.arrays.array_char;

public class ToCharArray {
    public static void main(String[] args) {

        String value = "cat";

        // Convert string to a char array.
        char[] array = value.toCharArray();
        array[0] = 'h';

        // Loop over chars in the array.
        for (char c : array) {
            System.out.println(c);
        }
    }
}
