package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTeam {
    private List<Employee> employees;

    public EmployeeTeam() {
        employees = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("Employees: %s", employees);
    }

    public void addEmployeeToTeam(Employee newEmployee) {
        employees.add(newEmployee);
    }

    public void removeEmployeeFromTeam(int index) {
        employees.remove(index);
    }

    public void removeEmployeeFromTeam2(Employee employee) {
        employees.remove(employee);
    }
}
