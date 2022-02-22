package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*Imagine that you have an array of strings of random length.
	Implement the method that returns how many groups of strings grouped by the same length are present.
	For example, there are 5 lines in the array:
	2 are 10 characters long, 2 are 18 characters long and one is 4 characters long.
	So in this array there are 3 different groups.*/

        String[] arrayStr = getNewRandomArray();
        printArrayStr(arrayStr);
        System.out.println();
        groupStringsByLength(arrayStr);
    }

    public static String[] getNewRandomArray() {
        Random random = new Random(System.currentTimeMillis());
        int size = random.nextInt(10) + 1;
        String[] newRandomArray = new String[size];
        for (int i = 0; i < size; i++) {
            int l = random.nextInt(10) + 1;
            newRandomArray[i] = getRandomString(l);
        }
        return newRandomArray;
    }

    public static String getRandomString(int length) {
        Random random = new Random(System.currentTimeMillis());
        String str = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder buffer = new StringBuilder(length);
        for (int j = 0; j < length; j++) {
            int ch = random.nextInt(str.length());
            buffer.append(str.charAt(ch));
        }
        return buffer.toString();
    }

    public static void groupStringsByLength(String[] arrayStr) {
        int[] sortedLengths = sortLengthString(arrayStr);
        printGroups(sortedLengths);
    }

    public static int[] sortLengthString(String[] arrayStr) {
        int[] arrayLengthString = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            arrayLengthString[i] = arrayStr[i].length();
        }
        Arrays.sort(arrayLengthString);
        return arrayLengthString;
    }

    public static void printGroups(int[] arrayLengthString) {
        int count = 1;
        int number = arrayLengthString[0];
        for (int i = 1; i < arrayLengthString.length; i++) {
            if (arrayLengthString[i - 1] == arrayLengthString[i]) {
                count++;
            } else {
                System.out.println(count + " strings are " + number + " characters long");
                number = arrayLengthString[i];
                count = 1;
            }
        }
        System.out.println(count + " strings are " + number + " characters long");
    }

    public static void printArrayStr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
