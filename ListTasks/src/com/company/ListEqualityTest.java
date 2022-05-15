package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEqualityTest {
    @Test
    public void testListEquality() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 7);
        List<String> listEqualityExpected = Arrays.asList("Yes", "Yes", "Yes", "Yes", "No");

        Assertions.assertArrayEquals(listEqualityExpected.toArray(), ListEquality.getListEquality(list1, list2).toArray());
    }
}
