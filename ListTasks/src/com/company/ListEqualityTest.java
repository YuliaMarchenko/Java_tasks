package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListEqualityTest {
    @Test
    public void testListEquality() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(7);

        List<String> listEqualityExpected = new ArrayList<>();
        listEqualityExpected.add("Yes");
        listEqualityExpected.add("Yes");
        listEqualityExpected.add("Yes");
        listEqualityExpected.add("Yes");
        listEqualityExpected.add("No");

        Assertions.assertArrayEquals(listEqualityExpected.toArray(), ListEquality.getListEquality(list1,list2).toArray());
    }
}
