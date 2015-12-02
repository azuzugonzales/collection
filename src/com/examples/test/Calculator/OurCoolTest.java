package com.examples.test.calculator;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class OurCoolTest {
    @Test
    public void simpleCheck() {
        Calculator calculator = new Calculator(2, 2);
        int result = calculator.getResult();
        assertTrue("Resultat(" + result + ") not equals 4", result == 4);
    }

}
