package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChangeLowerCaseTest {

    private Transformer t;

    @BeforeEach
    public void setup() {
        t = new ChangeLowerCase();
    }

    @Test
    public void testLowerCaseOneChange() {
        String str = "aaa BB dEfxc";
        String expectedResult = "aaa bb dEfxc";
        Assertions.assertEquals(expectedResult, t.transform(str));
    }

    @Test
    public void testToLowerCaseNoChange(){
        String str = "AAA bb dEfxc";
        String expectedResult = "AAA bb dEfxc";
        Assertions.assertEquals(expectedResult, t.transform(str));
    }

    @Test
    public void testToLowerCaseTwoChange() {
        String str = "aaa BB BB dEfxc";
        String expectedResult = "aaa bb bb dEfxc";
        Assertions.assertEquals(expectedResult, t.transform(str));
    }

    @Test
    public void testToLowerCaseEmptyString() {
        String str = "";
        Assertions.assertEquals(str, t.transform(str));
    }

}
