package com.company;

public class Student implements TaskAddedObserver{
    private String name;
    private int yearOfBirthday;
    private double gpa;

    public Student(String name, int yearOfBirthday, double gpa) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void onTaskAdded(Task task) {
        System.out.println("Student " + getName() + " sees a task " + task.getId());
    }

}
