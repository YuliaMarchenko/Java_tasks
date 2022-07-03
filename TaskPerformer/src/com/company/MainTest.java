package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
    @Test
    public void testTasksPerformerFromBerlin() {
        Task task1 = new Task(1, "title1", 1, "done");
        Task task2 = new Task(2, "title2", 1, "done");
        Task task3 = new Task(3, "title3", 2, "canceled");
        Task task4 = new Task(4, "title4", 3, "done");
        Task task5 = new Task(5, "title5", 1, "canceled");

        Performer ivan = new Performer("Ivan", "Berlin", task1);
        Performer daria = new Performer("Daria", "Potsdam", task2);
        Performer elena = new Performer("Elena", "Berlin", task3);
        Performer dmitriy = new Performer("Dmitriy", "Leipzig", task4);
        Performer sofia = new Performer("Sofia", "Berlin", task5);

        List<Performer> performers = Arrays.asList(ivan, daria, elena, dmitriy, sofia);

        Map<Integer, String> result = new HashMap<>();
        result.put(1, "title1");
        result.put(3, "title3");
        result.put(5, "title5");

        Assertions.assertEquals(result, Main.getTasksPerformerFromBerlin(performers));
    }

    @Test
    public void testTaskNotDone() {
        Task task1 = new Task(1, "title1", 1, "in progress");
        Task task2 = new Task(2, "title2", 2, "done");
        Task task3 = new Task(3, "title3", 1, "canceled");
        Task task4 = new Task(4, "title4", 3, "done");
        Task task5 = new Task(5, "title5", 2, "canceled");

        List<Task> tasks = Arrays.asList(task1, task2, task3, task4, task5);

        Map<Integer, List<Task>> result = new HashMap<>();
        result.put(1, Arrays.asList(task1, task3));
        result.put(2, Arrays.asList(task5));

        Assertions.assertEquals(result, Main.getTaskNotDone(tasks));
    }

    @Test
    public void testGetMap() {
        Task task1 = new Task(1, "title1", 1, "done");
        Task task2 = new Task(2, "title2", 1, "done");
        Task task4 = new Task(4, "title4", 3, "done");
        Task task5 = new Task(5, "title5", 1, "canceled");

        Performer ivan = new Performer("Ivan", "Berlin", task1);
        Performer daria = new Performer("Daria", "Potsdam", task2);
        Performer sofia1 = new Performer("Sofia", "Leipzig", task4);
        Performer sofia2 = new Performer("Sofia", "Berlin", task5);

        List<Performer> performers = Arrays.asList(ivan, daria, sofia1, sofia2);

        Person sofiaPerson = new Person("Sofia");
        Person ivanPerson = new Person("Ivan");
        Person dariaPerson = new Person("Daria");

        Map<Person, List<Task>> result = new HashMap<>();
        result.put(sofiaPerson, Arrays.asList(task4, task5));
        result.put(ivanPerson, Arrays.asList(task1));
        result.put(dariaPerson, Arrays.asList(task2));

        Assertions.assertEquals(result, Main.getMapPerson(performers));
    }

    @Test
    public void testTaskNotDoneFalse() {
        Task task1 = new Task(1, "title1", 1, "done");
        Task task2 = new Task(2, "title2", 1, "in progress");
        Task task3 = new Task(3, "title3", 2, "canceled");
        Task task4 = new Task(4, "title4", 3, "done");
        Task task5 = new Task(5, "title5", 1, "canceled");

        Person sofiaPerson = new Person("Sofia");
        Person ivanPerson = new Person("Ivan");
        Person dariaPerson = new Person("Daria");
        Person elenaPerson = new Person("Elena");

        Map<Person, List<Task>> mapPersonTasks = new HashMap<>();
        mapPersonTasks.put(sofiaPerson, Arrays.asList(task4, task5));
        mapPersonTasks.put(ivanPerson, Arrays.asList(task1));
        mapPersonTasks.put(dariaPerson, Arrays.asList(task2));
        mapPersonTasks.put(elenaPerson, Arrays.asList(task3));

        Map<Boolean, List<Task>> result = new HashMap<>();
        result.put(false, Arrays.asList(task2));
        result.put(true, Arrays.asList(task4, task1));

        Assertions.assertEquals(result, Main.getTaskNotDoneFalse(mapPersonTasks));
    }
}
