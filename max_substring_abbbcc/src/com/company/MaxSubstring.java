package com.company;

public class MaxSubstring {

    static int maxSubstring(String str) {
        if (str.length() == 1) return 1;
        int max = 0;
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }
}
