package com.company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private EmployeeTeam team;

    public Manager(String name, String surname) {
        super(name, surname);
        team = new EmployeeTeam();
    }

    @Override
    public String doWork() {
        return "supervises staff: " + team;
    }

    public void addEmployeeToTeam(Employee newEmployee){
        team.addEmployeeToTeam(newEmployee);
    }

    public void removeEmployeeFromTeam(int index){
        team.removeEmployeeFromTeam(1);
    }
}
