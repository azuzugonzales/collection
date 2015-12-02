package com.examples.average.exampl02;

public class ItemTest {
    public static void main(String[] args) {

        // The size method can only be accessed from an instance.
        Item item = new Item();
        int value = item.size();
        System.out.println(value);
    }
}
