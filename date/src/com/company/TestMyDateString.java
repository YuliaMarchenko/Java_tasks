package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyDateString {
    @Test
    public void testMyDateString() {
        MyDate date = new MyDate("2022-10-21");
        Assertions.assertEquals(2022, date.getYear());
        Assertions.assertEquals(10, date.getMonth());
        Assertions.assertEquals(21, date.getDay());
    }
}
