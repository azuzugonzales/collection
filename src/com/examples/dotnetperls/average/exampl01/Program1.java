package com.examples.dotnetperls.average.exampl01;

public class Program1 {
    static int totalLength(String a, String b) {
        // Add up length of two strings.
        return a.length() + b.length();
    }

    static int averageLength(String a, String b) {
        // Divide total length by 2.
        return totalLength(a, b) / 2;
    }

    public static void main(String[] args) {

        // Call method
        int total = totalLength("Golden", "Bowl");
        int average = averageLength("Golden", "Bowl");

        System.out.println(total);
        System.out.println(average);
    }
}
