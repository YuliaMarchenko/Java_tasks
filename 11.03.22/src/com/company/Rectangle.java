package com.company;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle (int length, int breadth){
        this.length = length;
        this.breadth = breadth;

        System.out.println("Perimeter = " + getPerimeter(length, breadth));
        System.out.println("Area = " + getArea(length, breadth));
    }

    public static int getPerimeter(int length, int breadth){
        int perimeter = 2 * (length + breadth);
        return perimeter;
    }

    public static int getArea(int length, int breadth){
        int area = length * breadth;
        return area;
    }
}
