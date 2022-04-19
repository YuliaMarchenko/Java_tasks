package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* 1.Метод принимает двумерный массив и возвращает количество строк(подмассивов),
        в которых нет отрицательных элементов (continue с меткой)*/

        int[][] twoDimArray = {{1, 2, 3}, {9, -9, 0}, {7, 8, 9}};
       noNegatives(twoDimArray);

       /* 2.Сложить числа в двумерном массиве только из тех подмассивов где нету отрицательных элементов.*/

    }

    public static void noNegatives(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            boolean flag = false;
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] < 0) {
                    flag = true;
                }
            }
            if (flag) continue;
            System.out.print(i + " ");
        }
    }
}
