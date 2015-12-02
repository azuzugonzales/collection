package com.examples.arraylist.exampl01;

public class Thing {
    public String name;
    public int amt;

    public Thing(String name, int amt) {
        this.name = name;
        this.amt = amt;
    }

    public String toString() {
        return String.format("%s: %d", name, amt);
    }

    public int getAmt() {
        return amt;
    }
}
