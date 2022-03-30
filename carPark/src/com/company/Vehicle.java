package com.company;

public class Vehicle {
    private String number;
    public int year;

    public Vehicle(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("№ %s, %s year", number, year);
    }

    public String goToRace(){
        return "not defined";
    }
}
