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

        try {
            validate(12);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception: " + ex);
        }
    }

        public static int findMaxOccuredElm (List < Integer > numbers) {
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

        public static int findSingleNumber (List < Integer > numbers) {
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

        public static List<String> anagramList (String str, List < String > strings){
            Map<String, List<String>> anagrams = new HashMap<>();

            for (String s : strings) {
                String sortedKey = sortWord(s);
                if (anagrams.containsKey(sortedKey)) {
                    List<String> value = anagrams.get(sortedKey);
                    value.add(s);
                } else {
                    List<String> value = new ArrayList<>();
                    value.add(s);
                    anagrams.put(sortedKey, value);
                }
            }
            return anagrams.get(sortWord(str));
        }

        private static String sortWord (String s){
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            return new String(letters);
        }

        public static void validate ( int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("age is not valid to vote");
            } else {
                System.out.println("welcome to vote");
            }
        }
    }
