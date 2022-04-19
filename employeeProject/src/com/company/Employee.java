package com.company;

public class Employee {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Employee %s %s ", surname, name);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String doWork() {
        return "not defined";
    }
}
