package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutNumbersLessGiven {

    public static List<Integer> getListWithoutNumbersLessGiven (List<Integer> numbers, int number){
        List<Integer> listNew = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) < number){
                listNew.add(numbers.get(i));
            }
        }
        return listNew;
    }
}
