package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseIntegerListTest {
    @Test
    public void testListEquality() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> numbersExpected = new ArrayList<>();
        numbersExpected.add(5);
        numbersExpected.add(4);
        numbersExpected.add(3);
        numbersExpected.add(2);
        numbersExpected.add(1);

     //   Assertions.assertArrayEquals(numbersExpected.toArray(), ReverseIntegerList.getReverseIntegerList(numbers).toArray());
    }
}
