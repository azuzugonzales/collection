package com.examples.dotnetperls.arrays.array_int;

public class Building {
    int[] apartmentIds = new int[10];

    public void addResidentAt(int id) {
        // Add to the array at this index.
        apartmentIds[id]++;
    }

    public void removeResidentAt(int id) {
        // Subtract from element value.
        apartmentIds[id]--;
    }

    public int getOccupancyAt(int id) {
        // Return element value.
        return apartmentIds[id];
    }
}
