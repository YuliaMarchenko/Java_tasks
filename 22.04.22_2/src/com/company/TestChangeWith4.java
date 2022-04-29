package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestChangeWith4 {

    @Test
    public void testToLowerCaseOneChange() {
        String str = "aaa BBBB dEfxc";
        Assertions.assertEquals("aaa bbbb dEfxc", Main.transform(str, new ChangeWith4()));
    }

    @Test
    public void testToLowerCaseNoChange(){
        String str = "AAA bbbb dEfxc";
        Assertions.assertEquals("AAA bbbb dEfxc", Main.transform(str, new ChangeWith4()));
    }

    @Test
    public void testToLowerCaseTwoChange() {
        String str = "aaa BBBB BBBB dEfxc";
        Assertions.assertEquals("aaa bbbb bbbb dEfxc", Main.transform(str, new ChangeWith4()));
    }

    @Test
    public void testToLowerCaseEmptyString() {
        String str = "";
        Assertions.assertEquals("", Main.transform(str, new ChangeWith4()));
    }

}
