package com.examples.calc;

public class CalculatorTest {
    public static void main(String[] args) {
        Holder holder = new Holder(5, 7);
        Printer printer = new Printer();

        printer.print(new Calculator().sum(holder.getFirst(), holder.getSecond()));

    }
}
