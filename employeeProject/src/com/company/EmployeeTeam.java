package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* Implement the following features in the Employee project in EmployeeTeam:
1 - done. The int size() method that returns how many Employees in the team.
2 - done. The Employee get(int index) method that return the Employee with the given index
3 - done. The remove (String name) method that remove Employees by the name
4 - done. Removal of several employees from the team at once (removeAll).
It should be possible to use an array of Employee or EmployeeTeam to set the list of removed workers.
5 - done. Adding several employees to a team at a time (addAll).
As previous It should be possible to set the list by array or by EmployeeTeam
6 - no. Since our EmployeeTeam allows null cells at the end of the array, it could takes up extra memory.
Implement the trimToSize() method that trims the capacity of the array to be the real current size.
7 - done. The method that returns the new EmployeeTeam with all employees with the given name from this team.
8 - done. Implement the method that returns the EmployeeTeam with all programmers or all QA Engineers from this team.*/

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

    public int size() {
        return employees.size();
    }

    public Employee get(int index) {
        return employees.get(index);
    }

    public void addAllEmployees(Employee[] allEmployeesForAdd) {
        for (Employee employee : allEmployeesForAdd) {
            employees.add(employee);
        }
    }

    public void removeAllEmployees(Employee[] allEmployeesForRemove) {
        for (Employee employee : allEmployeesForRemove) {
            employees.remove(employee);
        }
    }

    public EmployeeTeam newEmployeeTeam(String name) {
        EmployeeTeam newEmployeeTeam = new EmployeeTeam();
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().equals(name.toLowerCase())) {
                newEmployeeTeam.addEmployeeToTeam(employee);
            }
        }
        return newEmployeeTeam;
    }

    public EmployeeTeam backEndProgrammers() {
        EmployeeTeam backEndEmployeeTeam = new EmployeeTeam();
        for (Employee employee : employees) {
            if (employee instanceof BackEnd) {
                backEndEmployeeTeam.addEmployeeToTeam(employee);
            }
        }
        return backEndEmployeeTeam;
    }
}
