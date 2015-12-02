package com.examples.test.mycalculator;

public class Calculator {

    private int first;
    private int second;

    int z;

    private int result;

    public Calculator() {

    }

    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void getResult(int first, int second) {
        z = first + second;
        System.out.println("result OK = " + z);
    }





    /*public int setMin() {
        return first < second;
    }

    public int getMin() {
        if(first < second) {
            return true;
        } else {
            return false;
        }
    }*/
}
