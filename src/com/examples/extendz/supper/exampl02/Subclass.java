package com.examples.extendz.supper.exampl02;

public class Subclass extends Superclass {

    Subclass(int age) {
        super(age);
    }

    public static void main(String[] args) {
        Subclass sub = new Subclass(24);
        sub.getAge();
    }
}
