package com.examples.test.calculator;

public class Calculator {
    private int first;
    private int second;

    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getResult() {
        return first * second;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator(2, 3);
        int result = calc.getResult();
        System.out.println(result);
    }
}
