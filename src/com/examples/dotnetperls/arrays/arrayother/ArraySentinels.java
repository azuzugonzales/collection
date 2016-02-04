package com.examples.dotnetperls.arrays.arrayother;

public class ArraySentinels {

    static void scan(int[] buffer) {
        for (int i = 0; i < buffer.length; i++) {
            // Terminate loop when sentinel element is detected.
            if (buffer[i] == -1) {
                break;
            }
            System.out.println(buffer[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // The sentinel element is the sixth one.
        int[] buffer = { 10, 20, 30, 25, 35, -1, 50, 55 };
        scan(buffer);
        // Make the third element the sentinel.
        buffer[2] = -1;
        scan(buffer);
    }
}
