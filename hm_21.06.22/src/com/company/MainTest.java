package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainTest {
    @Test
    public void testCountElement(){
        List<String> list = Arrays.asList("cat", "dog", "bird", "cat", "cat", "dog");
        Map<String, Integer> map = Map.of(
                "cat",3,
                "dog", 2,
                "bird", 1);
        Assertions.assertEquals(map, Main.countElement(list));
    }
}
