package com.company;

import java.util.Comparator;

public class NameComparator implements Comparator<Students> {
    public int compare(Students a, Students b) {
        return a.getName().compareTo(b.getName());
    }
}
