package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        1. Есть класс автомобиль, в котором есть три поля: марка, модель,цена.
        Написать метод, который принимает лист автомобилей, а возвращает Treemap,
        ключами которого являются марки автомобилей, а значениями будут TreeSet автомобилей,
        в котором автомобили расположены в лексикографическом порядке относительно модели,
        причем дешевые вперед если модели одинаковые
        auto1 -> Volvo, c60, 50000
        auto2 -> Mercedes, bmers600, 60000
        auto3 -> Mercedes, amers600, 40000
        auto4 -> Volvo, c60, 10000
        Mercedes - [auto3,auto2]
        Volvo - [auto4,auto1]

        2. Написать метод, принимающий лист слов,начинающихся с маленькой буквы ,
        а возвращающий Treemap, ключами которого являются буквы, а значениями - листы слов,
        начинающихся с данной буквы и расположенных в лексикографическом порядке.
        {hello,world,hell}-> {h:[hell,hello], w:[world]}

        3. Есть лист интов и некое целое число n. Написать метод , проверяющий найдутся ли в листе два такие числа,
        что их произведение равно числу n. Решить задачу нескольким способами пара способов
        без использования дополнительных структур данных и вариант с использованием структуры данных ( deque, queue,)
        */
    }

    public static Map<String, TreeSet<Auto>> getAuto(List<Auto> autos) {
        Map<String, TreeSet<Auto>> treeMapAutos = new TreeMap<>();
        for (Auto auto : autos) {
            String key = auto.getBrand();
            if (treeMapAutos.containsKey(key)) {
                TreeSet<Auto> set = treeMapAutos.get(key);
                set.add(auto);
            } else {
                TreeSet<Auto> set = new TreeSet<>();
                set.add(auto);
                treeMapAutos.put(key, set);
            }
        }
        return treeMapAutos;
    }

    public static Map<Character, TreeSet<String>> getWord(List<String> words) {
        Map<Character, TreeSet<String>> treeMapWord = new TreeMap<>();
        for (String word : words) {
            char key = word.charAt(0);
            if (treeMapWord.containsKey(key)) {
                TreeSet<String> set = treeMapWord.get(key);
                set.add(word);
            } else {
                TreeSet<String> set = new TreeSet<>();
                set.add(word);
                treeMapWord.put(key, set);
            }
        }
        return treeMapWord;
    }

    public static boolean multiplication(List<Integer> numbers, int num) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) * numbers.get(i + 1) == num) return true;
        }
        return false;
    }
}
