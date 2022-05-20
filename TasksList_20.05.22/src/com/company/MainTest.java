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
}
