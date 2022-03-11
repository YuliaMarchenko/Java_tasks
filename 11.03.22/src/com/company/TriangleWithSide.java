package com.company;

public class TriangleWithSide {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public TriangleWithSide() {
        System.out.println("Perimeter = " + getPerimeter(side1, side2, side3));
        System.out.println("Area = " + getArea(side1, side2, side3));
    }

    public static int getPerimeter(int side1, int side2, int side3) {
        int p = side1 + side2 + side3;
        return p;
    }

    public static double getArea(int side1, int side2, int side3) {
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }
}
