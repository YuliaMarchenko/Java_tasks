package com.company;

public class Area {
    private String figureName;

    public Area(String figureName) {
        this.figureName = figureName;
    }

    public double getArea() {
        int area = 0;
        return area;
    }

    @Override
    public String toString() {
        return String.format("%s has area %.2f", figureName, getArea());
    }
}
