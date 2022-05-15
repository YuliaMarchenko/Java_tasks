package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoListInOneTest {
    @Test
    public void testTwoListInOne() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> listExpected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Assertions.assertArrayEquals(listExpected.toArray(), TwoListInOne.getTwoListInOne(list1, list2).toArray());
    }
}
