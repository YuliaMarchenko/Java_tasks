package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //написать метод, возвращающий элемент из списка, встречающийся наибольшее количество раз
        //написать метод, возвращающий элемент из списка, не имеющий пары
    }

    public static int findMaxOccuredElm(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer each : numbers) {
            Integer count = map.get(each);

            if (count == null) {
                count = 0;
            }
            map.put(each, count + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max && entry.getValue() != 1) {
                max = entry.getKey();
            }
        }

        return max;
    }

    public static int findSingleNumber(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer each : numbers) {
            Integer count = map.get(each);

            if (count == null) {
                count = 0;
            }
            map.put(each, count + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
