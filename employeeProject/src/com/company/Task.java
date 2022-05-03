package com.company;

    /* Implement the ability to add a task to an Employee (2022-04-20 #14 №6) in the way we discussed in class.

    In the Employee you need to implement new feature assign a Task(id, status, description) to each Employee.
    Think how you can implement it. NOTE each employee can solve more than one task,
    and each task can be solved by more than one employee. */

public class Task {
    private int id;
    private int status; // 0 - done; 1 - in progress; 2 - to do
    private String description;

    public Task(int id, int status, String description) {
        this.id = id;
        this.status = status;
        this.description = description;
    }
}
