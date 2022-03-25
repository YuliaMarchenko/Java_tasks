package com.company;

public class AreaOfCircle extends Area {
    private int radius;
    private String figureName;

    public AreaOfCircle(int radius, String figureName) {
        super(figureName);
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
