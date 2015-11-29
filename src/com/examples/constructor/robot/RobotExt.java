package com.examples.constructor.robot;

public class RobotExt extends Robot {
    // Constructor with parameters
    public RobotExt(double x, double y, double course) {
        // Call constructor parent class
        super(x, y);
        this.course = course;
    }

    public void back(int distance) {
        forward(-distance);
    }
}
