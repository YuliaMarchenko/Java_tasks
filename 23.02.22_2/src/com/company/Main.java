package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*Given two big arrays of integers from 10 to 99 (it’s a result of some of test).
	You should implement the method that mutually sorts these arrays. You could use any algorithm you know
	Example {13,78,12,18,12,36} {14,18,11,70} -> {11,12,12,13,14,18} {18,36,70,78}

	**Implement the previous task, but think in your system there is not enough memory for the resulting
	array[arr1.lenght+arr2.length] for merge like mergeSort does.*/
        int[] array1 = {13, 78, 12, 18, 12, 36};
        int[] array2 = {14, 18, 11, 70};
        mutuallySort(array1, array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }


    public static void mutuallySort(int[] array1, int[] array2) {
        int[] arrayTemp = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arrayTemp[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            arrayTemp[array1.length + j] = array2[j];
        }
        sort(arrayTemp);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = arrayTemp[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array2[j] = arrayTemp[array1.length + j];
        }
    }

    public static void sort(int[] array) {
        for (int j = 0; j < array.length; j++)
            for (int i = 1; i < array.length - j; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                }
            }
    }
}
