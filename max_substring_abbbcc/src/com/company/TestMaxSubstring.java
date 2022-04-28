package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaxSubstring {
    @Test
    public void testMaxSubstringNormalString(){
        Assertions.assertEquals(3, MaxSubstring.maxSubstring("abbbcc"));
    }

    @Test
    public void testMaxSubstringEmptyString(){
        Assertions.assertEquals(0, MaxSubstring.maxSubstring(""));
    }
    
}
