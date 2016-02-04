package com.examples.dotnetperls.arrays.array_int;

public class ArrayReturn {

    static int[] getEmployees() {
        // Create an int array and return it.
        int[] array = new int[6];
        array[0] = 9;
        array[1] = 11;
        array[2] = 15;
        array[3] = 19;
        array[4] = 29;
        array[5] = 55;
        return array;
    }

    public static void main(String[] args) {

        // Loop over an array returned by a method.
        for (int e : getEmployees()) {
            System.out.println(e);
        }
    }
}
