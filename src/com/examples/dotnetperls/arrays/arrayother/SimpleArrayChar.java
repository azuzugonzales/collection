package com.examples.dotnetperls.arrays.arrayother;

public class SimpleArrayChar {
    public static void main(String[] args) {

        // Create an arrayother of four chars.
        char[] values = new char[4];
        values[0] = 'j';
        values[1] = 'a';
        values[2] = 'v';
        values[3] = 'a';

        // Loop aver arrayother with for-loop.
        for (char value : values) {
            System.out.println(value);
        }
    }
}
