package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TwoListInOneTest {
    @Test
    public void testTwoListInOne() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        List<Integer> listExpected = new ArrayList<>();
        listExpected.add(1);
        listExpected.add(2);
        listExpected.add(3);
        listExpected.add(4);
        listExpected.add(5);
        listExpected.add(6);
        listExpected.add(7);
        listExpected.add(8);
        listExpected.add(9);
        listExpected.add(10);

        Assertions.assertArrayEquals(listExpected.toArray(), TwoListInOne.getTwoListInOne(list1, list2).toArray());
    }
}
