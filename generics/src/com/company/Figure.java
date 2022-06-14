package com.company;

public abstract class Figure implements Comparable<Figure>{

    public abstract double getArea();

    @Override
    public int compareTo(Figure figure){
        if (this.getArea() == figure.getArea()){
            return 0;
        }
        if (this.getArea() > figure.getArea()){
            return 1;
        }
        return -1;
    }
}