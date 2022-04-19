package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/* Write a method that displays second max element of an int array.
	The array contains no less than two 2 elements.*/

        int[] arr = {2, 3, 3, 3, 2};
        find2Largest(arr);
        find2Largest2(arr);

	/* Write a method that displays smallest and second smallest elements of an int unsorted array.
	Do not sort the array. The array contains no less than two 2 elements. */

        find2Min(arr);
        find2Min2(arr);

    /* Write a method that accepts an int array which contains all the numbers with a pair except one.
     The method should return the number which has no pair (tip: use one of the logical functions) */

        int[] arrNoPair = {2, 6, 5, 6, 6, 2, 5};
        System.out.println(elementNoPair(arrNoPair));
        System.out.println(elementNoPair2(arrNoPair));
    }


    public static void find2Largest(int arr[]) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }

    public static void find2Largest2(int arr[]) {
        int max = arr[0];
        int secondMax;
        if (max > arr[1]) {
            secondMax = arr[1];
        } else {
            secondMax = arr[0];
            max = arr[1];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println(secondMax);
    }

    public static void find2Min(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void find2Min2(int arr[]) {
        int min = arr[0];
        int secondMin;
        if (min < arr[1]) {
            secondMin = arr[1];
        } else {
            secondMin = arr[0];
            min = arr[1];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < secondMin) {
                secondMin = arr[i];
                min = Math.min(secondMin, min);
            }
        }
        System.out.println(min + " " + secondMin);
    }

    public static int elementNoPair(int[] arr) {
        Arrays.sort(arr);
        int elementNoPair = -1;
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                elementNoPair = arr[i];
                break;
            }
        }

        if (arr.length % 2 != 0 && elementNoPair == -1) {
            return arr[arr.length - 1];
        }

        return elementNoPair;
    }

    public static int elementNoPair2(int[] arr){
        int res = 0;
        for (int i=0; i<arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
