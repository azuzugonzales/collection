package com.examples.extendz.animal.exampl01;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println();

        animal.sleep();
        animal.eat();

        bird.sleep();
        bird.eat();

        dog.sleep();
        dog.eat();

        System.out.println("-Inheritance and Casting-");

        // Inheritance and Casting
        Animal a1 = new Dog();
        Animal a2 = new Bird();

        a1.eat();
        a2.sleep();

        // The following statements are incorrect
        // Dog d = new Animal();
        // Bird b = new Animal();

        // The instanceof operator
        System.out.println("-The instanceof operator-");
        Dog d = new Dog();
        if(d instanceof Animal) {
            Animal a = (Animal) d;
            a.sleep();
        }
        d.sleep();
    }
}
