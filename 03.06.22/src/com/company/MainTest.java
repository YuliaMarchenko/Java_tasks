package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    public void testFindMaxOccuredElmThreeTimes(){
        List<Integer> numbers = Arrays.asList(1,3,3,3,4);
        Assertions.assertEquals(3, Main.findMaxOccuredElm(numbers));
    }

    @Test
    public void testFindMaxOccuredElmTwoTimes(){
        List<Integer> numbers = Arrays.asList(2,2,5,3,-9);
        Assertions.assertEquals(2, Main.findMaxOccuredElm(numbers));
    }

    @Test
    public void testFindMaxOccuredElmNo(){
        List<Integer> numbers = Arrays.asList(1,2,5,3,-9);
        Assertions.assertEquals(Integer.MIN_VALUE, Main.findMaxOccuredElm(numbers));
    }
}