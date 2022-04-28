package com.company;

public class MaxSubstring {

    static int maxSubstring(String str) {
        int max = 0;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return max;
    }
}
