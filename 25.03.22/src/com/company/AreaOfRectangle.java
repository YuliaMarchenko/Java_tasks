package com.company;

public class AreaOfRectangle extends Area {
    private int side1;
    private int side2;
    private String figureName;

    public AreaOfRectangle(int side1, int side2, String figureName) {
        super(figureName);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return side1 * side2;
    }
}
