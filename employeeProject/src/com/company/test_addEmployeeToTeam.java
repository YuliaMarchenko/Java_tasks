package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test_addEmployeeToTeam {
    @Test
    public void testAddOneEmployee(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        employeeTeam.addEmployeeToTeam(vitalik);
        Assertions.assertEquals(vitalik,employeeTeam.get(0));
    }
    @Test
    public void testAddSeveralEmployee(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Employee kuzia = new FrontEnd("Kuzia", "Goroshek");
        Employee nikita = new FullStack("Nikita", "Galeev");
        employeeTeam.addEmployeeToTeam(vitalik);
        employeeTeam.addEmployeeToTeam(kuzia);
        employeeTeam.addEmployeeToTeam(nikita);
        Assertions.assertEquals(vitalik, employeeTeam.get(0));
        Assertions.assertEquals(kuzia, employeeTeam.get(1));
        Assertions.assertEquals(nikita, employeeTeam.get(2));
    }
}
