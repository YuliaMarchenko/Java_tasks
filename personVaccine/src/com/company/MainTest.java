package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    public void testGetPersonWithoutVaccine() {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Vasia", 467257484));
        list.add(new Person(2, "Petia", 415436212));
        list.add(new Person(1, "Vasia", 65827658));
        list.add(new Person(2, "Petia", 55466775));
        list.add(new Person(3, "Sophia", 453355));
        Person expected = new Person(3, "Sophia", 453355);
        Assertions.assertEquals(expected, Main.getPersonWithoutVaccine(list));
    }

    @Test
    public void testGetPersonWithoutVaccineNull() {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Vasia", 467257484));
        list.add(new Person(2, "Petia", 415436212));
        list.add(new Person(1, "Vasia", 65827658));
        list.add(new Person(2, "Petia", 55466775));
        Assertions.assertEquals(null, Main.getPersonWithoutVaccine(list));
    }
}
