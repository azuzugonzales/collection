package com.examples.extendz;

public class Employee extends Person {
    private String company;

    public Employee(String name, String surname, String company) {

        super(name, surname);
        this.company = company;
    }

    // variant I
    /*public void displayInfo() {
        System.out.println("Name: " + super.getName() + '\n' + "Surname: " +
                super.getSurname() + '\n' + "Company: " + company);
    }*/

    // variant II
    public void displayInfo() {

        super.displayInfo();
        System.out.println("Company: " + company);
    }
}
