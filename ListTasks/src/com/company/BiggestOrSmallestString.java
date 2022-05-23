package com.company;

import java.util.Collections;
import java.util.List;

public class BiggestOrSmallestString {
    public static String getBiggestOrSmallestString(List<String> words) {
        String max = words.get(0);
        int maxIndex = 0;
        String min = words.get(0);
        int minIndex = 0;
        for (int i = 1; i < words.size(); i++) {
            if (max.length() < words.get(i).length()) {
                max = words.get(i);
                maxIndex = i;
            }
            if (min.length() > words.get(i).length()){
                min = words.get(i);
                minIndex = i;
            }
        }

        if (maxIndex < minIndex) {
            return max;
        } else return min;
    }
}
