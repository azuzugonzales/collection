package com.examples.oop.example.book;

import com.examples.oop.example.author.Author;

public class BookTest {
    public static void main(String[] args) {
        Author teck = new Author("Tan Ah Teck", "teck@somewhere.com", 'm');
        System.out.println(teck);           // toString()

        Book dummyBook = new Book("Java for dummies", teck, 9.99, 88);
        System.out.println(dummyBook);      // toString()

        Book morDummyBook = new Book("Java for more dummies",
                new Author("Peter Lee", "peter@nowhere.com", 'm'),
                19.99, 8);
        System.out.println(morDummyBook);   // toString()
    }
}
