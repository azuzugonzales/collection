package com.examples.oop.book;

public class Book {

    private int id;
    private static int counter = 1;

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }

    public String name;
    public String author;
    public int year;

    public Book() {
        name = "n/a";
        author = "n/a";
        year = 0;
    }

    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        id = counter++;
    }

    public void info() {
        System.out.printf("Book '%s' (author %s) it was published in %d year \n", name, author, year);

    }
}
