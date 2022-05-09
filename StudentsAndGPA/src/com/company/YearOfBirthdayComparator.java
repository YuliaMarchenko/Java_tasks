package com.company;

import java.util.Comparator;

public class YearOfBirthdayComparator implements Comparator<Students> {
    public int compare(Students a, Students b) {
        return a.getYearOfBirthday() - b.getYearOfBirthday();
    }
}
