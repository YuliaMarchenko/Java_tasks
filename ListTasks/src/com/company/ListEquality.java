package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListEquality {

    public static List getListEquality(List<Integer> list1, List<Integer> list2) {
        List<String> listEquality = new ArrayList<>();
        if (list1.size() != list2.size()) return listEquality;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                listEquality.add("Yes");
            } else {
                listEquality.add("No");
            }
        }
        return listEquality;
    }
}

