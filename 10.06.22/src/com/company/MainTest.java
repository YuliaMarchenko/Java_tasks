package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MainTest {
    @Test
    public void testAuto(){
        Auto auto1 = new Auto("Volvo", "c60", 50000);
        Auto auto2 = new Auto("Mercedes", "brems600", 60000);
        Auto auto3 = new Auto("Mercedes", "brems600", 40000);
        Auto auto4 = new Auto("Volvo", "c60", 10000);
        List<Auto> autos = Arrays.asList(auto1, auto2, auto3, auto4);
        Map<String, TreeSet<Auto>> treeMapAutosExpected = new TreeMap<>();
        treeMapAutosExpected.put("Volvo", new TreeSet<>(Arrays.asList(auto1, auto4)));
        treeMapAutosExpected.put("Mercedes", new TreeSet<>(Arrays.asList(auto2, auto3)));
        Assertions.assertEquals(treeMapAutosExpected, Main.getAuto(autos));
    }

    @Test
    public void testWords(){
        List<String> words = Arrays.asList("hello", "hell", "rood");
        Map<Character, TreeSet<String>> treeMapWordsExpected = new TreeMap<>();
        treeMapWordsExpected.put('h', new TreeSet<>(Arrays.asList("hello", "hell")));
        treeMapWordsExpected.put('r', new TreeSet<>(Arrays.asList("rood")));
        Assertions.assertEquals(treeMapWordsExpected, Main.getWord(words));
    }

    @Test
    public void testMultiplication(){
        List<Integer> numbers = Arrays.asList(1,5,7,2,7);
        Assertions.assertTrue(Main.multiplication(numbers, 7));
    }
}
