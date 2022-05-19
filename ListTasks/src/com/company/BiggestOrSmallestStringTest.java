package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BiggestOrSmallestStringTest {
    @Test
    public void testBiggestString(){
        List<String> list = Arrays.asList("cat", "dog", "tasks", "no");
        Assertions.assertEquals("tasks",
                BiggestOrSmallestString.getBiggestOrSmallestString(list));
    }

    @Test
    public void testBiggestFromTwoString(){
        List<String> list = Arrays.asList("dodododd", "dog", "tasks", "no");
        Assertions.assertEquals("dodododd",
                BiggestOrSmallestString.getBiggestOrSmallestString(list));
    }

    @Test
    public void testSmallestString(){
        List<String> list = Arrays.asList("cat", "a", "tasks", "no");
        Assertions.assertEquals("a",
                BiggestOrSmallestString.getBiggestOrSmallestString(list));
    }

    @Test
    public void testSmallestFromTwoString(){
        List<String> list = Arrays.asList("b", "a", "tasks", "no");
        Assertions.assertEquals("b",
                BiggestOrSmallestString.getBiggestOrSmallestString(list));
    }
}
