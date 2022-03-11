package com.company;

public class Employee {
    int salary;
    int hours;

    public Employee(int salary, int hours) {
        this.salary = salary;
        this.hours = hours;

        int newSalary = salary + addSalary(salary) + addWork(hours);

        System.out.println("Salary = " + newSalary);
    }

    public static int addSalary(int salary) {
        int increase = 0;
        if (salary < 500) {
            increase = 10;
        }
        return increase;
    }

    public static int addWork(int hours) {
        int increase = 0;
        if (hours > 6) {
            increase = 5;
        }
        return increase;
    }
}
