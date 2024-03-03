package com.dsa.skyscraper;


// Represents a floor with its size and number
public class Floor implements Comparable<Floor> {
    private int floorNumber;
    private int size;

    public Floor(int floorNumber, int size) {
        this.floorNumber = floorNumber;
        this.size = size;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Floor other) {
        return Integer.compare(other.size, this.size); // Sort by size in descending order
    }
}
