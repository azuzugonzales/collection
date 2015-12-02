package com.examples.extendz.supper.exampl02;

public class Superclass {

    private int age;

    Superclass(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " + age);
    }
}
