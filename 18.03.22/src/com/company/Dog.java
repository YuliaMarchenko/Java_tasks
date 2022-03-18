package com.company;

public class Dog {
    private String name;
    private int age;
    static int counter;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public String toString() {
        return String.format("%s %s", name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error! Dog's age should not allow negative");
        }
    }
}
