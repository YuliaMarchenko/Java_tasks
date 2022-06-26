package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.geom.Area;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainTest {
    @Test
    public void testExistWrongEmailAllPresent() {
        Map<String, Person> persons = Map.of(
                "a@mail.com", new Person("Vasia", "Sidorov", "a@mail.com", 23),
                "b@mail.com", new Person("Gena", "Pupkin", "b@mail.com", 34));
        Assertions.assertFalse(Main.existWrongEmail(persons));
    }

    @Test
    public void testExistWrongEmailOneNotPresent() {
        Map<String, Person> persons = Map.of(
                "a@mail.com", new Person("Vasia", "Sidorov", "a@mail.com", 23),
                "c@mail.com", new Person("Gena", "Pupkin", "b@mail.com", 34));
        Assertions.assertTrue(Main.existWrongEmail(persons));
    }

    @Test
    public void testGenerateEmailList() {
        Map<String, Person> persons = Map.of(
                "a@mail.com", new Person("Vasia", "Sidorov", "a@mail.com", 23),
                "b@mail.com", new Person("Gena", "Pupkin", "b@mail.com", 15),
                "c@mail.com", new Person("Sofia", "Sidorova", "c@gmail.com", 18),
                "d@mail.com", new Person("Daria", "Sidorova", "d@gmail.com", 18),
                "e@mail.com", new Person("Sofia", "Sidorova", "e@gmail.com", 18),
                "f@mail.com", new Person("Kuzia", "Sidorova", "f@gmail.com", 18),
                "g@mail.com", new Person("Daria", "Sidorova", "g@gmail.com", 34),
                "h@mail.com", new Person("Oleg", "Sidorova", "h@gmail.com", 60),
                "j@mail.com", new Person("Kolia", "Sidorova", "j@gmail.com", 78),
                "z@mail.com", new Person("Kirill", "Sidorova", "z@gmail.com", 90));
        List<String> result = Main.generateEmailList(persons, 15, 18);
        Assertions.assertEquals(3, result.size());
        for (String email : result) {
            int age = persons.get(email).getAge();
            Assertions.assertTrue(age >= 15 && age <= 18);
        }
    }

    @Test
    public void testClosestValue() {
        List<Double> numbers = Arrays.asList(12.0, -23.6, 4.0, 34.9);
        Assertions.assertEquals(4.0, Main.closestValue(numbers, 5.0));
        Assertions.assertEquals(-23.6, Main.closestValue(numbers, -100.0));
    }
}
