package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCompareDate {
    @Test
    public void testCompareDateSmaller(){
       MyDate date = new MyDate(12,12,2021);
       MyDate date2 = new MyDate(13,12,2021);
       Assertions.assertEquals(-1, date.compareTo(date2));
    }

    @Test
    public void testCompareDateBigger(){
        MyDate date = new MyDate(12,12,2021);
        MyDate date2 = new MyDate(13,12,2021);
        Assertions.assertEquals(1, date2.compareTo(date));
    }

    @Test
    public void testCompareDateEquals(){
        MyDate date = new MyDate(12,12);
        MyDate date2 = new MyDate(12,12);
        Assertions.assertEquals(0, date2.compareTo(date));
    }
}
