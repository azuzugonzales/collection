package com.examples.oop.example.variant01;

public class Circle {
    // Private variables
    private double radius;
    private String color;

    // Constructors (overloaded)
    public Circle() {                       // 1st Constructo
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {               // 2nd Constructor
        radius = r;
        color = "green";
    }

    public Circle(double r, String c) {     // 3nd Constructor
        radius = r;
        color = c;
    }

    /*public Circle(double radius) {
        this.radius = radius;
    }*/

    // Public methods
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Method toString
    public String toString() {
        return "Circle with radius = " + radius + " and color " + color;
    }


    // 2 Execution entry point
    /*public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println(c1);
        System.out.println("c1 is: " + c1);

    }*/

    // 1 Execution entry point
    /*public static void main(String[] args) {

        Circle c1, c2, c3;

        c1 = new Circle();
        c2 = new Circle(2.0);
        c3 = new Circle(3.0, "red");

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea() + " " + c3.color);

        Circle c4 = new Circle(5.2, "green");

        System.out.println("radius " + c4.getRadius()
                + ": " + "color "
                + c4.getColor() + ".");
    }*/
}
