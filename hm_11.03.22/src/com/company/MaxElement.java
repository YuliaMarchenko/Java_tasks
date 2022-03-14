package com.company;

public class MaxElement {
    int[] arr;

    public MaxElement(int[] arr) {
        this.arr = arr;
    }

    public int max() {
        int max = this.arr[0];
        for (int i = 1; i< this.arr.length; i++){
            if(this.arr[i]>max){
                max = this.arr[i];
            }
        }
            return max;
    }
}
