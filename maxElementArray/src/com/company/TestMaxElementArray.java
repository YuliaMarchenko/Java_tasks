package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaxElementArray {

    @Test
    public void max_elemeny_empty_array(){
        int [] array = {};
        int expectedResult = Integer.MIN_VALUE;
        Assertions.assertEquals(expectedResult, MaxElementArray.maxElementArray(array));
    }

    @Test
    public void max_elemeny_last_place(){
        int [] array = {56, 89, 74, 101};
        int expectedResult = 101;
        Assertions.assertEquals(expectedResult, MaxElementArray.maxElementArray(array));
    }

    @Test
    public void max_elemeny_first_place(){
        int [] array = {560, 89, 74, 101};
        int expectedResult = 560;
        Assertions.assertEquals(expectedResult, MaxElementArray.maxElementArray(array));
    }

    @Test
    public void max_element_negative_numbers(){
        int [] array = {-560, 809, 74, -101, 78, 90};
        int expectedResult = 809;
        Assertions.assertEquals(expectedResult, MaxElementArray.maxElementArray(array));
    }

    @Test
    public void max_element_equals_numbers(){
        int [] array = {3, 3, 3, 3, 3, 3, 3, 3};
        int expectedResult = 3;
        Assertions.assertEquals(expectedResult, MaxElementArray.maxElementArray(array));
    }
}
