package com.company;

public class Main {

    public static void main(String[] args) {
	/* 2. Make a Calculator class, which will have 5 static methods:
	int plus(int a, int b) - returns the sum of a and b
	int minus(int a, int b) - returns the difference between a and b
	int multiply(int a, int b) - returns the product of a and b
	double divide(int a, int b) - returns the result of dividing a by b
	double percent(int a, int b) - returns b percent of the number a
	(for example, percent(4, 50) should return 50% of 4)*/

        System.out.println(Calculator.plus(10,23));
        System.out.println(Calculator.minus(10,23));
        System.out.println(Calculator.multiply(10,23));
        System.out.println(Calculator.divide(48,23));
        System.out.println(Calculator.percent(4,60));

	/* 3. Create a class, which will have a method to find max element of int array.
	The class must have a constructor accepting int array.*/

        int [] arr = {2, 5, 22, 6, 9, 13};
        System.out.println(new MaxElement(arr).max());
    }
}
