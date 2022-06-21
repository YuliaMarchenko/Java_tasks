package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	/*Реализовать обобщенный метод  который получая  лист возвращает map, где ключом является объект,
	а значением, сколько раз этот объект встречается в исходном листе.
	Ограничение: для перебора использовать forEach() , для добавления значений в map метод map.merge()*/
    }

    public static Map<String, Integer> countElement (List<String> list) {

        Map<String, Integer> map = new HashMap<>();

        list.forEach(s -> map.merge(s, 1, (value, step) -> value + step));

        return map;
    }
}
