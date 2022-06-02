package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    public void duplicatesTest(){
        List<String> input = Arrays.asList("Ivan","Maria","Piotr","Anna","Maria","Ivan");
        List<String> expected = Arrays.asList("Ivan","Maria");
        Assertions.assertEquals(expected, Main.getDuplicates(input));
    }

    @Test
    public void dominateElementTest(){
        List<Integer> numbers = Arrays.asList(1,3,3,3,4);
        Assertions.assertEquals(3, Main.getDominateElement(numbers));
    }

    @Test
    public void noDominateElementTest(){
        List<Integer> numbers = Arrays.asList(1,0,9,3,4);
        Assertions.assertEquals(-1, Main.getDominateElement(numbers));
    }
}
