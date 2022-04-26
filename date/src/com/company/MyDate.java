package com.company;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(int day, int month) {
        this.day = day;
        this.month = month;
        this.year = 2022;
    }

    public MyDate(String s){
        String [] word = s.split("-");
        this.year = Integer.parseInt(word[0]);
        this.month = Integer.parseInt(word[1]);
        this.day = Integer.parseInt(word[2]);
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(MyDate date) {
        if (this == date) return 0;
        if (this.year > date.year) {
            return 1;
        }
        if (this.year < date.year) {
            return -1;
        }
        if (this.month > date.month) {
            return 1;
        }
        if (this.month < date.month) {
            return -1;
        }
        if (this.day > date.day) {
            return 1;
        }
        if (this.day < date.day) {
            return -1;
        }
        return 0;
    }
}

