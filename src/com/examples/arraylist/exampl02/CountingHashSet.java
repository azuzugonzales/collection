package com.examples.arraylist.exampl02;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CountingHashSet extends HashSet {
    private int count = 0;
    public boolean add(Object o) {
        count++;
        return super.add(o);
    }
    public boolean addAll(Collection c) {
        count += c.size();
        return super.addAll(c);
    }
    int getCount() {
        return count;
    }

    public static void main(String[] args) {
        CountingHashSet s = new CountingHashSet();
        s.addAll(Arrays.asList("bar", "baz", "plugh"));

        System.out.println(s);
    }
}
