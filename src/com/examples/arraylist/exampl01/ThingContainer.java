package com.examples.arraylist.exampl01;

import java.util.ArrayList;

public class ThingContainer extends ArrayList<Thing> {
    public void report() {
        for(int i = 0; i < size(); i++) {
            System.out.println(get(i));
        }
    }

    public int total() {
        int tot = 0;
        for (int i = 0; i < size(); i++) {
            tot += ((Thing)get(i)).getAmt();
        }
        return tot;
    }
}
