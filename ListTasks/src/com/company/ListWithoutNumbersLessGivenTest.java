package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListWithoutNumbersLessGivenTest {
    @Test
    public void testListWithoutNumbersLessGivenTest (){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listExpected = Arrays.asList(1, 2, 3);

        Assertions.assertArrayEquals(listExpected.toArray(), ListWithoutNumbersLessGiven.getListWithoutNumbersLessGiven(list,4).toArray());
    }
}
