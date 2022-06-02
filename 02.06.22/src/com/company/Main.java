package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	/* 1.C использованием множеств написать метод, возвращающий повторяющиеся элементы из списка
	List getDuplicates(Listinput {Ivan,Maria,Piotr,Anna,Maria,Ivan}->{Ivan,Maria}

	2.Есть массив с положительными целыми числами. найти элемент(если он есть),
	который встречается в массиве > length/2 (доминантный). В противном случае вернуть -1. */
    }

    public static List<String> getDuplicates(List<String> input) {
        Set<String> duplicates = new HashSet<>();
        Set<String> seen = new HashSet<>();

        for (String each: input) {
            if (seen.contains(each)) {
                duplicates.add(each);
            } else {
                seen.add(each);
            }
        }

        return duplicates.stream().toList();
    }

    public static int getDominateElement(List<Integer> numbers){
        Map<Integer,Integer> map = new HashMap<>();

        for (Integer each: numbers){
            Integer count = map.get(each);

            if (count == null){
                count = 0;
            }
            map.put(each, count + 1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > numbers.size() / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
