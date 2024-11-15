package com.patterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        House.Builder builder = new House.Builder();
        House house = builder
                .setFoundation("Concrete")
                .setWalls("Brick")
                .setWindows("Glass")
                .setDoors("Wood")
                .build();

        house.display();
    }
}
