package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Implement the method that calculates the sum of integer array. You should not use any loops. Use the recursion.
        int[] array = getNewRandomArray(5, -50, 50);
        System.out.println(Arrays.toString(array));
        System.out.println(sumArray(array, 0));

        // Implement the method that create an array int[n][n] of random integers
        int[][] NewRandomToDimArray = getNewRandomToDimArray(3, 4, -50, 50);
        System.out.println(Arrays.deepToString(NewRandomToDimArray));

        //Implement the method that finds the row’s index in the array int[n][k] of random integers with minimum sum of elements
        System.out.println(getIndexMinSum(NewRandomToDimArray));
    }

    public static int[] getNewRandomArray(int size, int min, int max) {
        int[] newRandomArray = new int[size];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            newRandomArray[i] = random.nextInt(max - min + 1) + min;
        }
        return newRandomArray;
    }

    public static int sumArray(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + sumArray(array, index + 1);
    }

    public static int[][] getNewRandomToDimArray(int rows, int columns, int min, int max) {
        int[][] NewRandomToDimArray = new int[rows][columns];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                NewRandomToDimArray[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return NewRandomToDimArray;
    }

    public static int getIndexMinSum(int[][] NewRandomToDimArray) {
        int minSum = Integer.MAX_VALUE;
        int rows = -1;
        for (int i = 0; i < NewRandomToDimArray.length; i++) {
            int newSum = sumDimArray(NewRandomToDimArray,i);
            if (newSum<minSum){
                minSum = newSum;
                rows = i;
            }
        }
        return rows;
    }

    public static int sumDimArray(int[][] NewRandomToDimArray, int rows) {
        int sum = 0;
        for (int i = 0; i < NewRandomToDimArray[rows].length; i++) {
            sum += NewRandomToDimArray[rows][i];
        }
        return sum;
    }
}
