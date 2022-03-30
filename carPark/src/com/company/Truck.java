package com.company;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String number, int year, double loadCapacity) {
        super(number, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Load capacity = " + loadCapacity;
    }

    public String goToRace(){
        return String.format("Truck %s can carry %.2f tons of cargo", super.toString(),loadCapacity);
    }
}
