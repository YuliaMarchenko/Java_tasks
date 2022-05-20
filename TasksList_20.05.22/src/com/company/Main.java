package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static int getIndexSumRightEqualsLeft(List<Integer> numbers) {
        int index = 0;
        int size = numbers.size();
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            leftSum += numbers.get(i);
            rightSum += numbers.get(j);

            while (leftSum < rightSum && i < j) {
                i++;
                leftSum += numbers.get(i);
            }

            while (rightSum < leftSum && i < j) {
                j--;
                rightSum += numbers.get(j);
            }

            if (leftSum == rightSum && i == j)
                index = i;
        }
        return index;
    }
}
