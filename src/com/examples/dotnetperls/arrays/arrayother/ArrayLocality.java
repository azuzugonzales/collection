package com.examples.dotnetperls.arrays.arrayother;

public class ArrayLocality {
    public static void main(String[] args) {

        // Create an arrayother and fill it with values.
        int[] values = new int[1000000];
        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }

        long t1 = System.currentTimeMillis();

        // Version 1: sum 100 elements that are packed together.
        for (int i = 0; i < 1000000; i++) {
            int sum = 0;
            for (int x = 0; x < 100; x++) {
                sum += values[x];
            }
            if (sum == 0) {
                System.out.println(false);
            }
        }

        long t2 = System.currentTimeMillis();

        // Version 2: sum 100 elements spaced apart by 100 slots each.
        for (int i = 0; i < 1000000; i++) {
            int sum = 0;
            for (int x = 0; x < 10000; x += 100) {
                sum += values[x];
            }
            if (sum == 0) {
                System.out.println(false);
            }
        }

        long t3 = System.currentTimeMillis();

        // ... Times.
        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }
}

