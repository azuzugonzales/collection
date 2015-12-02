package com.examples.test.mycalculator;

public class CalculatorTest {

    public static void main(String[] args) {
        int a = 5, b = 10;

        Calculator demo1 = new Calculator(4, 7);
        Calculator demo2 = new Calculator(2, 3);

        Integer first = demo1.getFirst();
        Integer second = demo1.getSecond();

        demo1.getResult(a, b);



        System.out.println("Val = " + demo2.getFirst()
                + "; " + demo2.getSecond()
                + " Result = "
                + demo2);
        System.out.println("First print " + demo1.getFirst());
        System.out.println("Second print " + demo1.getSecond());
        demo2.getResult(first, second);


    }
}
