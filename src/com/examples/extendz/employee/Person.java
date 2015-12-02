package com.examples.extendz.employee;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // variant I
    /*public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }*/

    // variant II
    public void displayInfo() {
        System.out.println("Name: " + name + '\n' + "Surname " + surname);
    }
}
