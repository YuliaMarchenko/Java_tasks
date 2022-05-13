package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListNameWithoutNameLength4 {
    public static List getListNameWithoutNameLength4(List<String> names) {
        List<String> nameList = new ArrayList<>();
        for (String name : names) {
            if (name.length() != 4) {
                nameList.add(name);
            }
        }
        return nameList;
    }
}
