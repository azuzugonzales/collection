package com.examples.dotnetperls.average.exampl03;

public class ApplyTest {
    public static void main(String[] args) {

        // Create new Apply and call public method.
        Apply a = new Apply();
        a.apply();

        // Cannot call a private method:
        // a.validate();
    }
}
