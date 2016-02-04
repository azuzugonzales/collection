package com.examples.dotnetperls.arrays.array_char;

public class ArrayStringBuilder {
    public static void main(String[] args) {

        long t1 = System.currentTimeMillis();

        // Version 1: create string from char array.
        for (int i = 0; i < 1_000_000; i++) {
            char[] array = new char[10];
            for (int v = 0; v < 10; v++) {
                array[v] = '?';
            }
            String result = new String(array);
        }

        long t2 = System.currentTimeMillis();

        // Version 2: create string from a StringBuilder.
        for (int i = 0; i < 1_000_000; i++) {
            StringBuilder builder = new StringBuilder();
            for (int v = 0; v < 10; v++) {
                builder.append('?');
            }
            String result = builder.toString();
        }

        long t3 = System.currentTimeMillis();

        // ... Benchmark timings.
        System.out.println(t2 - t1 + " ms:  char[] array");
        System.out.println(t3 - t2 + " ms:  StringBuilder append");
    }
}
