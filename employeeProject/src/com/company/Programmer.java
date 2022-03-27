package com.company;

public class Programmer extends Employee {

    public Programmer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String doWork() {
        return "writes code";
    }
}
