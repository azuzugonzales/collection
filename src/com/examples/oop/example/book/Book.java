package com.examples.oop.example.book;

import com.examples.oop.example.author.Author;

public class Book {
    // Private variables
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Constructor

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = 0;    // Not given, set to the default value
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // toString() t describe itself
    public String toString() {
        return "'" + name + "' by " + author;   // author.toString()
    }
}
