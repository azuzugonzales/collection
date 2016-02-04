package com.examples.dotnetperls.arrays.arrayother;

public class ArrayBooleanReverse {
    public static void main(String[] args) {

        boolean[] values = { false, true, true, true };

        // Loop over arrayother elements in reverse order.
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println(values[i]);
        }
    }
}
