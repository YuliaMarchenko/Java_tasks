package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
	/* 1. Есть класс Task {int id, String title, int priority, String status} и
	класс Performer {String name, String city, Task task}.  Дан List< Performer>.
	Для всех задач, исполнители которых из Берлина, необходимо получить мапу, где ключом является id задачи,
	а значением title данной задачи.

	2. Дан список Task {int id, String title, int priority, String status}.
	Необходимо получить мапу, где ключом является приоритет, а значением список не завершенных
	(статус завершенной задачи - «done»)  задач, данного приоритета.

	3. Дан List< Performer> (см.пункт 1) необходимо получить мапу <Person, List<Task>>.
	Person – класс, который содержит одно поле String name из класса Performer.

	4. Дана мапа <Person, List<Task>>. Необходимо получить мапу <Boolean, Task>, где ключом,
	все не завершенные задачи будут относиться к ключу false, а все завершенные к ключу true.
	Задачи со статусом “canceled” не должны учитываться.

	5. Дан список  Programmer, у каждого из которых есть имя и список технологий, которыми он владеет,
	например, языки программирования. Необходимо получить мапу, где ключ название технологии,
	а значение список программистов ей владеющий.*/
    }

    public static Map<Integer, String> getTasksPerformerFromBerlin(List<Performer> performers) {
        return performers.stream()
                .filter(performer -> performer.getCity() == "Berlin")
                .map(performer -> performer.getTask())
                .collect(Collectors.toMap(task -> task.getId(), task -> task.getTitle()));
    }

    public static Map<Integer, List<Task>> getTaskNotDone(List<Task> tasks) {
        return tasks.stream()
                .filter(task -> !task.getStatus().equals("done"))
                .collect(Collectors.groupingBy(Task::getPriority));
    }

    public static Map<Person, List<Task>> getMapPerson(List<Performer> performers) {
        return performers.stream()
                .collect(
                        Collectors.groupingBy(
                                performer -> new Person(performer.getName()),
                                Collectors.mapping(Performer::getTask, Collectors.toList())
                        )
                );
    }

    public static Map<Boolean, List<Task>> getTaskNotDoneFalse(Map<Person, List<Task>> mapPersonTasks) {
        return mapPersonTasks.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .filter(task -> !task.getStatus().equals("canceled"))
                .collect(Collectors.partitioningBy(task -> task.getStatus().equals("done"), Collectors.toList()));
    }
}
