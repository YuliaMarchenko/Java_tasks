package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {
    private List<Employee> employees;

    public EmployeeSort(List<Employee> employees) {
        this.employees = employees;
    }

    public void sortEmployees(Comparator<Employee> comparator) {
        Collections.sort(employees);
    }
}
