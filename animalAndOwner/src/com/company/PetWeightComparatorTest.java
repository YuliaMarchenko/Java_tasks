package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PetWeightComparatorTest {
    @Test
    public void testSortByName(){
        Pet cat = new Pet("murka", 10, "grey", "Vasia");
        Pet dog = new Pet("tuzik", 15, "white", "Vasia");
        Pet cat2 = new Pet("agusha", 30, "white", "Vasia");
        Pet[] pets = {cat, dog, cat2};
        Arrays.sort(pets, new PetWeightComparator());
        Assertions.assertEquals(pets[0], cat);
        Assertions.assertEquals(pets[1], dog);
        Assertions.assertEquals(pets[2], cat2);
    }
}
