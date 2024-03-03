package com.dsa.skyscraper;


import java.util.*;

// Main class containing the main method
public class SkyscraperConstructionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of floors in the building: ");
        int N = scanner.nextInt();
        ConstructionProcess constructionProcess = new ConstructionProcess();
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the floor size given on day " + (i + 1) + ": ");
            int size = scanner.nextInt();
            Day day = new Day(i + 1);
            day.addFloor(new Floor(i + 1, size));
            constructionProcess.addDay(day);
            constructSkyscraper(constructionProcess);
        }
        scanner.close();
    }

    public static void constructSkyscraper(ConstructionProcess constructionProcess) {
        for (Day currentDay : constructionProcess.getDays()) {
            currentDay.printAssembledFloors();
        }
    }
}
