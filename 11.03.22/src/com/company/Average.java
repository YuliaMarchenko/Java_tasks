package com.company;

public class Average {
    int num1;
    int num2;
    int num3;

    public Average(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

        System.out.println("Average = " + getAverage(num1, num2, num3));
    }

    public static double getAverage(int num1, int num2, int num3){
        double average = (num1 + num2 + num3)/3;
        return average;
    }
}
