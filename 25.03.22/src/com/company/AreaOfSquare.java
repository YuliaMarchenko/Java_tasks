package com.company;

public class AreaOfSquare extends Area {
    private int side;
    private String figureName;

    public AreaOfSquare(int side, String figureName) {
        super(figureName);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
