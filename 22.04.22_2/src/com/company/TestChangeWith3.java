package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestChangeWith3 {

    @Test
    public void testToUpperCaseOneChange(){
        String str = "aaa BBBB dEfxc";
        Assertions.assertEquals("AAA BBBB dEfxc", Main.transform(str, new ChangeWith3()));
    }

    @Test
    public void testToUpperCaseNoChange(){
        String str = "AAA BBBB dEfxc";
        Assertions.assertEquals("AAA BBBB dEfxc", Main.transform(str, new ChangeWith3()));
    }

    @Test
    public void testToUpperCaseTwoChange(){
        String str = "aaa BBBB bbb dEfxc";
        Assertions.assertEquals("AAA BBBB BBB dEfxc", Main.transform(str, new ChangeWith3()));
    }

    @Test
    public void testToUpperCaseEmptyString(){
        String str = "";
        Assertions.assertEquals("", Main.transform(str, new ChangeWith3()));
    }
}
