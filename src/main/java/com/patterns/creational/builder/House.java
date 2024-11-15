package com.patterns.creational.builder;

public class House {
    private String foundation;
    private String walls;
    private String windows;
    private String doors;

    // Private constructor, only accessed by the Builder
    private House() {
    }

    // Setters for the components
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    // Display the house details
    public void display() {
        System.out.println("House constructed with the following components:");
        System.out.println("Foundation: " + foundation);
        System.out.println("Walls: " + walls);
        System.out.println("Windows: " + windows);
        System.out.println("Doors: " + doors);
    }

    // Builder class
    public static class Builder {
        private House house;

        public Builder() {
            house = new House();
        }

        // Setters for the components
        public Builder setFoundation(String foundation) {
            house.setFoundation(foundation);
            return this;
        }

        public Builder setWalls(String walls) {
            house.setWalls(walls);
            return this;
        }

        public Builder setWindows(String windows) {
            house.setWindows(windows);
            return this;
        }

        public Builder setDoors(String doors) {
            house.setDoors(doors);
            return this;
        }

        // Build method to return the constructed house
        public House build() {
            return house;
        }
    }
}
