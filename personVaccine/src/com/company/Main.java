package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	/* Дан List. Каждый Record состоит из Person(int id, String name) и некого числового значения Long timecode.
	Естественно, id – уникально. Известно, что каждому Person в списке соответствует две записи
	(предположим, два этапа вакцинации). Но один Person имеет только одну запись (вторую вакцинацию пропустил).
	Необходимо найти этого Person’а. Решите эту задачу всеми известными Вам способами. */
    }

    public static Person getPersonWithoutVaccine(List<Person> list) {
        Map<Person, Integer> mapMoreOne = new HashMap<>();
        for (Person person : list) {
            if (mapMoreOne.containsKey(person)) {
                mapMoreOne.put(person, mapMoreOne.get(person) + 1);
            } else {
                mapMoreOne.put(person, 1);
            }
        }
        for (Map.Entry<Person, Integer> entry : mapMoreOne.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}
