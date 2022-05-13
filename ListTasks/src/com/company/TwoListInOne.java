package com.company;

import java.util.ArrayList;
import java.util.List;

public class TwoListInOne {
    public static List<Integer> getTwoListInOne(List<Integer> list1, List<Integer> list2) {
        List<Integer> listNew = new ArrayList<>();
        listNew.addAll(list1);
        listNew.addAll(list1.size(),list2);
        return listNew;
    }
}
