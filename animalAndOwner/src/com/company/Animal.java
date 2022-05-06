package com.company;

public class Animal{
    private String name;
    private int weight;
    private String colour;

    public Animal(String name, int weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }
}
