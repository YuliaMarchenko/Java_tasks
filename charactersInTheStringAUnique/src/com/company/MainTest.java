package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testCheckUniqueCharactersFalse(){
        String str = "dfgjd";
        Assertions.assertEquals(false, Main.checkUniqueCharacters(str));
    }

    @Test
    public void testCheckUniqueCharactersTrue(){
        String str = "dfgjzxbnm";
        Assertions.assertEquals(true, Main.checkUniqueCharacters(str));
    }

    @Test
    public void testCheckUniqueCharactersWithAsciiFalse(){
        String str = "dfgjd";
        Assertions.assertEquals(false, Main.checkUniqueCharactersWithAscii(str));
    }

    @Test
    public void testCheckUniqueCharactersWithAsciiTrue(){
        String str = "dfgjzxbnm";
        Assertions.assertEquals(true, Main.checkUniqueCharactersWithAscii(str));
    }
}
