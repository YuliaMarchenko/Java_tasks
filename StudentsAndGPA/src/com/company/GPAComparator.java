package com.company;

import java.util.Comparator;

public class GPAComparator implements Comparator<Students> {
    public int compare(Students a, Students b) {
        if (a.getGpa() == b.getGpa()){
            return 0;
        }
        if (a.getGpa() > b.getGpa()){
            return 1;
        }
        return -1;
    }
}
