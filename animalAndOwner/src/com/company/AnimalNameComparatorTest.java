package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class AnimalNameComparatorTest {
    @Test
    public void testSortByName(){
        Animal cat = new Animal("murka", 10, "grey");
        Animal dog = new Animal("tuzik", 15, "white");
        Animal cat2 = new Animal("agusha", 30, "white");
        Animal[] animals = {cat, dog, cat2};
        Arrays.sort(animals, new AnimalNameComparator());
        Assertions.assertEquals(animals[0], cat2);
        Assertions.assertEquals(animals[1], cat);
        Assertions.assertEquals(animals[2], dog);
    }
}
