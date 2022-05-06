package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AnimalNameComparatorLastLetterTest {
    @Test
    public void testSortByName(){
        Animal cat = new Animal("murka", 10, "grey");
        Animal dog = new Animal("tuzik", 15, "white");
        Animal cat2 = new Animal("agushab", 30, "white");
        Animal[] animals = {cat, dog, cat2};
        Arrays.sort(animals, new AnimalNameComparatorLastLetter());
        Assertions.assertEquals(animals[0], cat);
        Assertions.assertEquals(animals[1], cat2);
        Assertions.assertEquals(animals[2], dog);
    }
}
