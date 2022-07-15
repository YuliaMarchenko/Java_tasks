package com.company;

public class Counter {
    private int counter;

    public Counter(Integer counter) {
        this.counter = counter;
    }

    public Integer getCounter() {
        return counter;
    }

    public synchronized int increase() {
        return ++this.counter;
    }

    public synchronized int decrease() {
        return --this.counter;
    }

    public void print() {
        if (counter % 100 == 0) {
            System.out.println(this.counter);
        }
    }
}
