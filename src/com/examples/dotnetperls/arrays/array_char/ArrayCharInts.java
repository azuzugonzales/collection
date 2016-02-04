package com.examples.dotnetperls.arrays.array_char;

public class ArrayCharInts {
    public static void main(String[] args) {

        // Numbers can be stored in a char array.
        // ... These indicate a char base on ASCII.
        char[] values = new char[3];
        values[0] = 97;
        values[1] = 98;
        values[2] = 99;
        System.out.println(values);

        // We can specify letters as well.
        char[] values2 = { 'a', 'b', 'c' };
        System.out.println(values2);
    }
}
