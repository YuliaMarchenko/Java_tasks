package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestChangeWith5 {
    @Test
    public void testStarsOneChange() {
        String str = "aaa bbbb dEfxc";
        Assertions.assertEquals("aaa bbbb *****", Main.transform(str, new ChangeWith5()));
    }

    @Test
    public void testStarsNoChange(){
        String str = "AAA bbbb *****";
        Assertions.assertEquals("AAA bbbb *****", Main.transform(str, new ChangeWith5()));
    }

    @Test
    public void testStarsTwoChange() {
        String str = "aaa BBBBc BBBB dEfxc";
        Assertions.assertEquals("aaa ***** BBBB *****", Main.transform(str, new ChangeWith5()));
    }

    @Test
    public void testStarsEmptyString() {
        String str = "";
        Assertions.assertEquals("", Main.transform(str, new ChangeWith5()));
    }

}
