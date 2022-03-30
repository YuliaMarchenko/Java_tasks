package com.company;

public class Bus extends Vehicle{
    private int numberOfPassengers;

    public Bus(String number, int year, int numberOfPassengers) {
        super(number, year);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Passengers = " + numberOfPassengers;
    }

    public String goToRace(){
        return String.format("Bus %s can carry %d passengers", super.toString(), numberOfPassengers);
    }
}
