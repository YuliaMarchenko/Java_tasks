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
        List<Integer> arrivals = Arrays.asList(910, 940, 950, 1200, 1500, 1900);
        List<Integer> departures = Arrays.asList(920, 1200, 1220, 1230, 1800, 2020);
        Assertions.assertEquals(2, Main.minPlatforms(arrivals, departures));
    }

    @Test
    public void testMinPlatforms2(){
        List<Integer> arrivals = Arrays.asList(910, 940, 950, 1200, 1500, 1900);
        List<Integer> departures = Arrays.asList(920, 1200, 1220, 1230, 1800, 2020);
        Assertions.assertEquals(2, Main.minPlatforms2(arrivals, departures));
    }
}
