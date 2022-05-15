package com.company;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements TaskAddedObservable {
    private List<Task> tasks = new ArrayList<>();
    private List<TaskAddedObserver> observers = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
        this.notifyObservers(task);
    }

    @Override
    public void addObserver(TaskAddedObserver taskAddedObserver) {
        observers.add(taskAddedObserver);
    }

    @Override
    public void removeObserver(TaskAddedObserver taskAddedObserver) {
        observers.remove(taskAddedObserver);
    }


    @Override
    public void notifyObservers(Task task) {
        for(TaskAddedObserver taskAddedObserver: observers){
            taskAddedObserver.onTaskAdded(task);
        }
    }
}
