package com.examples.constructor.robot;

public class Robot {
    // Current coordinate X
    private double x = 0;
    // Current coordinate Y
    private double y = 0;
    // Current course (in grad)
    protected double course = 0;

    // Constructor
    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Of movement on distance
    public void forward(int distance) {
        // Appeal for the field object X
        x = x + distance * Math.cos(course / 180 * Math.PI);
        // Appeal for the field object Y
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }
        // Print coordinates robot
    public void printCoordinates() {
        System.out.println(x + ", " + y);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getCourse() {
        return course;
    }
    public void setCourse(double course) {
        this.course = course;
    }
}
