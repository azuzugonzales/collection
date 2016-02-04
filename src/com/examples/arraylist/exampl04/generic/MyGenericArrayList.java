package com.examples.arraylist.exampl04.generic;

import java.util.Objects;

public class MyGenericArrayList {
    private int size;   // number of elements
    private Object[] elements;

    public MyGenericArrayList() {   // constructor
        elements = new Object[10];  // allocate initial capacity of 10
        size = 0;
    }

    // Compiler replaces E with Object, but check e is of type E,
    // when inwoked to ensure type-safety
    public void add(Object e) {
        if (size < elements.length) {
            elements[size] = e;
        } else {
            // allocate a larger arrayother and add the element, omitted
        }
        ++size;
    }

    // Compiler replaces E with Object, and insert downcast operator (E<E>) for the return type when invoked
    public Object get(int index) {
        if (index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (Object)elements[index];
    }

    public int size() {
        return size;
    }
}
