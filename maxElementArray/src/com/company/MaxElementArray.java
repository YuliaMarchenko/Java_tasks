package com.company;

public class MaxElementArray {

    static int maxElementArray(int [] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
