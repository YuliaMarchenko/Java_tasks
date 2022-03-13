package com.company;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return String.format("%02d-%02d-%d",this.day,this.month,this.year);
    }
}
