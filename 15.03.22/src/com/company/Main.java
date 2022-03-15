package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите положительное число: ");
            size = sc.nextInt();
        } while (size<=0);

        int [] arr = new int [size];
        for (int i = 0; i < arr.length; i++) {
            int k;
            do {
                System.out.println("Введите положительное число для массива, меньше 1000: ");
                k = sc.nextInt();
            } while (k <= 0 || k>1000);
            arr[i] = k;
        }

        printArray(arr);
        System.out.println();
        sortLastNumber(arr);
        printArray(arr);
    }

    public static void sortLastNumber(int[] arr) {
        for (int j = 0; j < arr.length; j++)
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i - 1] % 10 > arr[i] % 10) {
                    int tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;
                }
            }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
