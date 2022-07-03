package com.company;

public class Task {
    int id;
    String title;
    int priority;
    String status;

    public Task(int id, String title, int priority, String status) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }
}
