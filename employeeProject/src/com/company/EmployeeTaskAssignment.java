package com.company;

public class EmployeeTaskAssignment {
    private Employee employee;
    private Task task;

    public EmployeeTaskAssignment(Employee employee, Task task) {
        this.employee = employee;
        this.task = task;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Task getTask() {
        return task;
    }
}
