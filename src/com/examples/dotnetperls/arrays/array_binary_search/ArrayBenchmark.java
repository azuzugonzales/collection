package com.examples.dotnetperls.arrays.array_binary_search;

import java.util.Arrays;

public class ArrayBenchmark {
    public static void main(String[] args) throws Exception {
        // Create 100 element arrayother.
        int[] values = new int[100];
        for (int i = 0; i < 100; i++) {
            values[i] = i;
        }

        long t1 = System.currentTimeMillis();

        // ... Search with binarySearch.
        for (int i = 0; i < 1_000_000; i++) {
            int index = Arrays.binarySearch(values, 80);
            if (index != 80) {
                throw new Exception();
            }
        }

        long t2 = System.currentTimeMillis();

        // ... Search with for-loop (linear).
        for (int i = 0; i < 1_000_000; i++) {
            int index = -1;
            for (int j = 0; j < values.length; j++) {
                if (values[j] == 80) {
                    index = j;
                    break;
                }
            }
            if (index != 80) {
                throw new Exception();
            }
        }

        long t3 = System.currentTimeMillis();

        // ... Times.
        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }
}
