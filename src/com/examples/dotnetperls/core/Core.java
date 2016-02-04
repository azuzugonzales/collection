package com.examples.dotnetperls.core;

public class Core {
    // static methods
    static int totalLength(String a, String b) {
        // Add up length of two strings.
        return a.length() + b.length();
    }

    public static int averageLength(String a, String b) {
        // Divide total length by 2.
        return totalLength(a, b) / 2;
    }

    public static void main(String[] args) {
        // Call methods
        int total = totalLength("Golden", "Bowl");
        int average = averageLength("Golden", "Bowl");

        System.out.println(total);
        System.out.println(average);
    }
}
