package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChangeUpperCaseTest {
    private Transformer t;

    @BeforeEach
    public void setup() {
        t = new ChangeUpperCase();
    }

    @Test
    public void testUpperCaseOneChange() {
        String str = "aaa BBBB dEfxc";
        String expectedResult = "AAA BBBB dEfxc";
        Assertions.assertEquals(expectedResult, t.transform(str));
    }

    @Test
    public void testUpperCaseNoChange() {
        String str = "AAA BBBB dEfxc";
        String expectedResult = "AAA BBBB dEfxc";
        Assertions.assertEquals(expectedResult, t.transform(str));
    }

    @Test
    public void testUpperCaseTwoChange() {
        String str = "aaa BBBB bbb dEfxc";
        String expectedResult ="AAA BBBB BBB dEfxc";
        Assertions.assertEquals(expectedResult, t.transform(str));
    }

    @Test
    public void testUpperCaseEmptyString() {
        String str = "";
        Assertions.assertEquals(str, t.transform(str));
    }
}
