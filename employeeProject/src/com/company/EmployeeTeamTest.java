package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTeamTest {

    @Test
    public void testSortEmployees(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Employee kuzia = new FrontEnd("Kuzia", "Goroshek");
        Employee nikita = new FullStack("Nikita", "Galeev");
        employeeTeam.addEmployeeToTeam(vitalik);
        employeeTeam.addEmployeeToTeam(kuzia);
        employeeTeam.addEmployeeToTeam(nikita);
        employeeTeam.sortEmployees();
        Assertions.assertEquals(nikita, employeeTeam.get(0));
        Assertions.assertEquals(kuzia, employeeTeam.get(1));
        Assertions.assertEquals(vitalik, employeeTeam.get(2));
    }

    @Test
    public void testSortEmployeesWithoutChange(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Employee kuzia = new FrontEnd("Kuzia", "Goroshek");
        Employee nikita = new FullStack("Nikita", "Galeev");
        employeeTeam.addEmployeeToTeam(nikita);
        employeeTeam.addEmployeeToTeam(kuzia);
        employeeTeam.addEmployeeToTeam(vitalik);
        employeeTeam.sortEmployees();
        Assertions.assertEquals(nikita, employeeTeam.get(0));
        Assertions.assertEquals(kuzia, employeeTeam.get(1));
        Assertions.assertEquals(vitalik, employeeTeam.get(2));
    }

    @Test
    public void testSortEmployeesEmptyArrayList() {
        EmployeeTeam employeeTeam = new EmployeeTeam();
        employeeTeam.sortEmployees();
        Assertions.assertEquals(0, employeeTeam.size());
    }

    @Test
    public void testAddTaskToEmployeeOneTaskOneEmployee(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Task task1 = new Task(1, 0, "Describe work in use-case");
        employeeTeam.addTaskToEmployee(vitalik, task1);
        Assertions.assertEquals(task1, employeeTeam.showEmployeeTasks(vitalik).get(0));
    }

    @Test
    public void testAddTaskToEmployeeTwoTasksOneEmployee(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Task task1 = new Task(1, 0, "Describe work in use-case");
        Task task2 = new Task(2, 1, "Code");
        employeeTeam.addTaskToEmployee(vitalik, task1);
        employeeTeam.addTaskToEmployee(vitalik, task2);
        Assertions.assertEquals(task1, employeeTeam.showEmployeeTasks(vitalik).get(0));
        Assertions.assertEquals(task2, employeeTeam.showEmployeeTasks(vitalik).get(1));
    }

    @Test
    public void testAddTaskToEmployeeOneTaskTwoEmployees(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Employee kuzia = new FrontEnd("Kuzia", "Goroshek");
        Task task1 = new Task(1, 0, "Describe work in use-case");
        employeeTeam.addTaskToEmployee(vitalik, task1);
        employeeTeam.addTaskToEmployee(kuzia, task1);
        Assertions.assertEquals(task1, employeeTeam.showEmployeeTasks(vitalik).get(0));
        Assertions.assertEquals(task1, employeeTeam.showEmployeeTasks(kuzia).get(0));
    }
}
