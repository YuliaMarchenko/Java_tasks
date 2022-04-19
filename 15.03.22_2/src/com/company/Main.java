package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arrSample = {1, 3, 6, 11, 17};
        int[] arr = {1, 3, 3, 6, 6, 11, 11, 17, 17};
        approximateBinarySearch(arr, arrSample);
        printArray(arr);
    }

    public static int [] approximateBinarySearch(int[] arr, int[] arrSample) {
        int r = arrSample.length - 1;
        int l = 0;
        int m = (l + r) / 2;
        for (int i = 0; i < arr.length; i++) {
            while (l <= r) {
                if (arrSample[m] < arr[i]) {
                    l = m + 1;
                } else if (arrSample[m] > arr[i]) {
                    r = m - 1;
                } else arr[i] = arrSample[m];
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
