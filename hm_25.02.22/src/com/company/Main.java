package com.company;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Найти сумму всех значений n-го подмассива двумерного массива.
        int[][] twoDimArray = getNewRandomTwoDimArray(3, 4, -50, 50);
        System.out.println("Sum = " + sumOfNSubArray(twoDimArray, 1));
        System.out.println();

        // Вывести на экран все значения двумерного массива
        print2Dim(twoDimArray);
        System.out.println();

        // Вывести на экран номер строки (подмассива) двумерного массива сумма всех элементов которого равна нулю.
        int[][] twoDimArrayWithSum0 = {{1, 3, -8, 6}, {2, -2, 1, 5, -1, -5}, {0, 0, 0, 0}};
        System.out.println(Arrays.deepToString(twoDimArrayWithSum0));
        System.out.println("Sub array with 0: " + sumOfSubArray0(twoDimArrayWithSum0));
        System.out.println();

        /* Есть обычный(одномерный) массив целых чисел больше нуля. Вася и Петя задумывают по одному числу.
        Найти наибольшую длину подмассива этого массива, такого что этот подмассив содержит поровну любимого
        числа Васи и Пети. Если такого подмассива не существует, вернуть 0. Подмассив имеется в виду часть
        массива от нулевого элемента и дальше.
        например: (7, 42)-> {6,42,11,7,1,42}-> 5, (7,42)-> {7,42,11,7,1,42}-> 6 */

        int[] arrNumbers = {7, 42, 11, 7, 1, 42};
        int numberPeter = 7;
        int numberVasia = 42;
        System.out.println("Max length sub array with numbers of Peter and Vasia is " + maxLengthSubArrayWithNumbers(arrNumbers, numberPeter, numberVasia));

    }

    public static int[][] getNewRandomTwoDimArray(int rows, int columns, int min, int max) {
        int[][] twoDimArray = new int[rows][columns];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDimArray[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return twoDimArray;
    }

    public static int sumOfNSubArray(int[][] twoDimArray, int n) {
        int sum = 0;
        for (int i = 0; i < twoDimArray[n].length; i++) {
            sum += twoDimArray[n][i];
        }
        return sum;
    }

    public static void print2Dim(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%d ", array[i][j]));
            }
            System.out.println();
        }
    }

    public static String sumOfSubArray0(int[][] twoDimArrayWithSum0) {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < twoDimArrayWithSum0.length; i++) {
            int sum = sumOfNSubArray(twoDimArrayWithSum0, i);
            if (sum == 0) {
                index.add(i);
            }
        }
        return index.toString();
    }

    public static int maxLengthSubArrayWithNumbers(int[] arrNumbers, int numberPeter, int numberVasia) {
        int maxLength = 0;
        int countPeter = 0;
        int countVasia = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] == numberPeter) {
                countPeter++;
            }
            if (arrNumbers[i] == numberVasia) {
                countVasia++;
            }
            if (countPeter != 0 && countVasia != 0 && countPeter == countVasia) {
                maxLength = i + 1;
            }
        }
        return maxLength;
    }
}
