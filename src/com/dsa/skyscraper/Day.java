package com.dsa.skyscraper;

import java.util.*;

// Represents a day in the construction process
public class Day {
    private int dayNumber;
    private Stack<Floor> assembledFloors;

    public Day(int dayNumber) {
        this.dayNumber = dayNumber;
        this.assembledFloors = new Stack<>();
    }

    public void addFloor(Floor floor) {
        assembledFloors.push(floor);
        Collections.sort(assembledFloors); // Sort assembled floors by size
    }

    public void printAssembledFloors() {
        System.out.print("Day: " + dayNumber + "\n");
        for (Floor floor : assembledFloors) {
            System.out.print(floor.getSize() + " ");
        }
        System.out.println();
    }
}
