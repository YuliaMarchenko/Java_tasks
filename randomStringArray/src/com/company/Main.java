package com.company;

import java.nio.charset.Charset;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*Задача: написать метод который заполняет массив строк случайными строками, случайной длины, заданного диапазона.
	Строки могут ничего не означать, слова в строках - случайный набор букв.*/
        printArray(getNewRandomArray());
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

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
