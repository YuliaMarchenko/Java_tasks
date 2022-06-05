package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //1. Написать метод, возвращающий элемент из списка, встречающийся наибольшее количество раз
        //2. Написать метод, возвращающий элемент из списка, не имеющий пары
        //3. Написать метод, который принимает список имен и их анаграмм и имя по которому он выдает список всех его анаграмм,
        // включая само имя {"ivan","airam","vani","vian","maria","kolya"}, ivan -> {ivan,vani,vian}
        //4. Написать метод "validate"  который принимает возраст человека и бросает "InvalidAgeException",
        // "age is not valid to vote", а если возраст меньше 18, а в противном случае выводит на экран надпись
        // "welcome to vote". В методе main вызвать этот метод и поймать эту exception.
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
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static List<String> anagramList(String str, List<String>strings){
        List<String> anagrams = new ArrayList<>();

        Map<> map = new HashMap<>();

        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        String newStr = new String(letters);

        for(String s: strings) {
            if (map.containsKey(newStr)) {
                anagrams.add(s);
            }
        }
        return anagrams;
    }
}
