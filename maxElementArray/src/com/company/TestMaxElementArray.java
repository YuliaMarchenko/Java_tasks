package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaxElementArray {

    @Test
    public void max_elemeny_empty_array(){
        int [] array = {};
        Assertions.assertEquals(Integer.MIN_VALUE, MaxElementArray.maxElementArray(array));
    }

    @Test
    public void max_elemeny_last_place(){
        int [] array = {56, 89, 74, 101};
        Assertions.assertEquals(101, MaxElementArray.maxElementArray(array));
    }

    @Test
    public void max_elemeny_first_place(){
        int [] array = {560, 89, 74, 101};
        Assertions.assertEquals(560, MaxElementArray.maxElementArray(array));
    }

    @Test
    public void max_element_negative_numbers(){
        int [] array = {-560, 809, 74, -101, 78, 90};
        Assertions.assertEquals(809, MaxElementArray.maxElementArray(array));
    }

    @Test
    public void max_element_equals_numbers(){
        int [] array = {3, 3, 3, 3, 3, 3, 3, 3};
        Assertions.assertEquals(3, MaxElementArray.maxElementArray(array));
    }
}
