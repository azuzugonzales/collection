package com.examples.dotnetperls.arrays.arrayother;

import java.util.ArrayList;

public class ArrayListSpeed {
    public static void main(String[] args) {

        // ... Create arrayother.
        int[] array = new int[100];
        array[0] = 1;

        // ... Create ArrayList.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < 100; i++) {
            list.add(0);
        }

        long t1 = System.currentTimeMillis();

        // Version 1: sum all elements in an arrayother.
        for (int i = 0; i < 1_000_000; i++) {

            int sum = 0;
            for (int v = 0; v < array.length; v++) {
                sum += array[v];
            }
            if (sum != 1) {
                System.out.println(false);
            }
        }

        long t2 = System.currentTimeMillis();

        // Version 2: sum all elements in an ArrayList.
        for (int i = 0; i < 1_000_000; i++) {

            int sum = 0;
            for (int v = 0; v < list.size(); v++) {
                sum += list.get(v);
            }
            if (sum != 1) {
                System.out.println(false);
            }
        }

        long t3 = System.currentTimeMillis();

        // ... Times.
        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }
}
