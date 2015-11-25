package com.examples.oop;

//import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace ", " L. N. Tolstoy", 1869);
        b1.info();
        b1.displayId();

        Book b2 = new Book("test1", "test2", 123);
        b2.info();
        b2.displayId();

        /*Scanner in = new Scanner(System.in);
        System.out.println(in);*/

        /*double result = sqrt(20);
        out.println(result);*/

        //System.out.printf("%s %s %s %s", "Hello","brave","new","world");


    }
}
