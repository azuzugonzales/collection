package com.examples.constructor.robot;

public class RobotManager {
    public static void main(String[] args) {
        // Create object class Robot - now with parameter
        RobotExt robot = new RobotExt(0, 0, 0);

        // Forward to 20 meter
        robot.forward(20);
        // Print coordinates
        robot.printCoordinates();

        // Change course
        robot.setCourse(90);
        // Forward to 20 meter
        robot.forward(20);
        // Print coordinates
        robot.printCoordinates();

        // Course 45 grad
        robot.setCourse(45);
        // Forward to 20 meter
        robot.forward(20);
        // Print coordinates
        robot.printCoordinates();
        // And to 10 meter back - this method to RobotExt
        robot.back(10);
        // Print coordinates
        robot.printCoordinates();

    }
}
