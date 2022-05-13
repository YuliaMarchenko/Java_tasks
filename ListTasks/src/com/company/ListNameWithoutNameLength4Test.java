package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListNameWithoutNameLength4Test {
    @Test
    public void testListNameWithoutNameLength4(){
        List<String> nameList = new ArrayList<>();
        nameList.add("Ivan");
        nameList.add("Maria");
        nameList.add("Stephan");
        nameList.add("John");
        nameList.add("Amalia");

        List<String> nameListExpected = new ArrayList<>();
        nameListExpected.add("Maria");
        nameListExpected.add("Stephan");
        nameListExpected.add("Amalia");

        Assertions.assertArrayEquals(nameListExpected.toArray(),
                ListNameWithoutNameLength4.getListNameWithoutNameLength4(nameList).toArray());
    }
}
