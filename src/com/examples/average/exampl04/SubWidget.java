package com.examples.average.exampl04;

public class SubWidget extends Widget {
    public void use() {
        // Asubclass can use a protected method in the base class.
        // ... It cannot use a private one.
        super.display();
    }
}
