package com.company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private List<Employee> team;

    public Manager(String name, String surname) {
        super(name, surname);
        team = new ArrayList<>();
    }

    @Override
    public String doWork() {
        return "supervises staff: " + team;
    }

    public void addEmployeeToTeam(Employee newEmployee){
        team.add(newEmployee);
    }
}
