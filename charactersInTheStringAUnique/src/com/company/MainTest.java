package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
    @Test
    public void testCheckUniqueCharactersFalse() {
        String str = "dfgjd";
        Assertions.assertEquals(false, Main.checkUniqueCharacters(str));
    }

    @Test
    public void testCheckUniqueCharactersTrue() {
        String str = "dfgjzxbnm";
        Assertions.assertEquals(true, Main.checkUniqueCharacters(str));
    }

    @Test
    public void testCheckUniqueCharactersWithAsciiFalse() {
        String str = "dfgjd";
        Assertions.assertEquals(false, Main.checkUniqueCharactersWithAscii(str));
    }

    @Test
    public void testCheckUniqueCharactersWithAsciiTrue() {
        String str = "dfgjzxbnm";
        Assertions.assertEquals(true, Main.checkUniqueCharactersWithAscii(str));
    }

    @Test
    public void testabPresent() {
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "Hi");
        actual.put("b", "There");
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "Hi");
        expected.put("b", "There");
        expected.put("ab", "HiThere");
        Assertions.assertEquals(expected, Main.ab(actual));
    }

    @Test
    public void testMapStringBoolean() {
        String[] strings = {"a", "b", "a", "b", "c"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);
        Assertions.assertEquals(expected, Main.mapStringBoolean(strings));
    }

    @Test
    public void testNameByNumberOccurence() {
        List<String> list = Arrays.asList("Vasia", "Daria", "Vasia");
        Assertions.assertEquals(2, Main.nameByNumberOccurence(list, "Vasia"));
    }

    @Test
    public void testNameByNumberOccurenceNo() {
        List<String> list = Arrays.asList("Vasia", "Daria", "Vasia");
        Assertions.assertEquals(0, Main.nameByNumberOccurence(list, "Sasha"));
    }

    @Test
    public void testRemoveDuplicates(){
        List<String> names = Arrays.asList("Ivan", "Ivan", "Sofia");
        List<String> expected = Arrays.asList("Sofia", "Ivan");
        Assertions.assertEquals(expected, Main.removeDuplicates(names));
    }
}
