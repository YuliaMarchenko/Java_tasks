package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	/* 1. Дан map<email, Person>. Необходимо проверить,
	что для всех записей email указанный в ключе соответствует email указанному у user-a
	2. Дан map<email, Person>. Необходимо сформировать список email-ов десяти уникальных пользователей,
	чей возраст попадает в заданный интервал.
	3. Дан List<Double>. Необходимо найти значение элемента максимально близкого к некоторому заданному значению N. */
    }

    public static boolean existWrongEmail(Map<String, Person> persons) {
        return persons
                .entrySet()
                .stream()
                .filter((entry) -> !entry.getKey().equals(entry.getValue().getEmail()))
                .findAny()
                .isPresent();
    }

    public static List<String> generateEmailList(Map<String, Person> persons, int ageFrom, int ageTo) {
        return persons
                .entrySet()
                .stream()
                .filter((entry) -> entry.getValue().getAge() >= ageFrom && entry.getValue().getAge() <= ageTo)
                .map((entry) -> entry.getKey())
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
    }

    public static double closestValue(List<Double> numbers, double n) {
        return numbers
                .stream()
                .reduce(Double.MAX_VALUE,
                        (candidate, number) -> Math.abs(candidate - n) < Math.abs(number - n) ? candidate : number);
    }
}
