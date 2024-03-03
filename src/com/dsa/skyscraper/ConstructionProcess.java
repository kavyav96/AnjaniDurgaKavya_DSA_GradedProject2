package com.dsa.skyscraper;

import java.util.*;

// Represents the construction process
public class ConstructionProcess {
    private List<Day> days;

    public ConstructionProcess() {
        this.days = new ArrayList<>();
    }

    public void addDay(Day day) {
        days.add(day);
    }

    public List<Day> getDays() {
        return days;
    }
}
