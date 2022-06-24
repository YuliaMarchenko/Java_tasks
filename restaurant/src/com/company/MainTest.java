package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void countOrderNumberTest(){
        long [] orderTimes = {10000,20000,30000,100000};
        int [] res = {0,1,2,0};
        Assertions.assertArrayEquals(res, Main.countOrderNumber(orderTimes,1));
    }
}
