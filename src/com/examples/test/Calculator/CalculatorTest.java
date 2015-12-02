package com.examples.test.calculator;

import org.testng.annotations.Test;


public class CalculatorTest {

    @Test
    public void testMain() throws Exception {
        Calculator calculator1 = new Calculator(2, 3);
        int result = calculator1.getResult();
        System.out.println(result);
    }
}