package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    public void testIndexSumRightEqualsLeft(){
        List<Integer> list = Arrays.asList(3,2,3,4,1);
        Assertions.assertEquals(2, Main.getIndexSumRightEqualsLeft(list));
    }

    @Test
    public void testMinPlatforms(){
        List<Integer> arrivals = Arrays.asList(900, 940, 950, 1100, 1500, 1800);
        List<Integer> departures = Arrays.asList(910, 1200, 1120, 1130, 1900, 2000);
        Assertions.assertEquals(3, Main.minPlatforms(arrivals, departures));
    }

    @Test
    public void testMinPlatforms2(){
        List<Integer> arrivals = Arrays.asList(900, 940, 950, 1100, 1500, 1800);
        List<Integer> departures = Arrays.asList(910, 1200, 1120, 1130, 1900, 2000);
        Assertions.assertEquals(3, Main.minPlatforms2(arrivals, departures));
    }
}
