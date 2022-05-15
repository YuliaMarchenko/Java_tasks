package com.company;

public interface TaskAddedObservable {
    void addObserver(TaskAddedObserver taskAddedObserver);
    void removeObserver(TaskAddedObserver taskAddedObserver);
    void notifyObservers(Task task);
}
