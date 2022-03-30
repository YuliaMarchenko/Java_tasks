package com.company;

public class Car extends Vehicle{
    private double loadCapacity;
    private int passengerCapacity;

    public Car(String number, int year, double loadCapacity, int passengerCapacity) {
        super(number, year);
        this.loadCapacity = loadCapacity;
        this.passengerCapacity = passengerCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return String.format("Load capacity = %.2f; passengers = %d", loadCapacity, passengerCapacity);
    }

    public String goToRace(){
        return String.format("Car %s can carry %s passengers and %.2f tons of cargo", super.toString(), passengerCapacity, loadCapacity);
    }
}
