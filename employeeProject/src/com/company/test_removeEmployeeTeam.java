package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test_removeEmployeeTeam {
    @Test
    public void testRemoveOneEmployee(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        employeeTeam.addEmployeeToTeam(vitalik);
        employeeTeam.removeEmployeeFromTeam2(vitalik);
        Assertions.assertEquals(0,employeeTeam.size());
    }
    @Test
    public void testRemoveSeveralEmployee(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        Employee kuzia = new FrontEnd("Kuzia", "Goroshek");
        Employee nikita = new FullStack("Nikita", "Galeev");
        employeeTeam.addEmployeeToTeam(vitalik);
        employeeTeam.addEmployeeToTeam(kuzia);
        employeeTeam.addEmployeeToTeam(nikita);
        employeeTeam.removeEmployeeFromTeam2(vitalik);
        Assertions.assertEquals(2, employeeTeam.size());
        employeeTeam.removeEmployeeFromTeam2(kuzia);
        Assertions.assertEquals(1, employeeTeam.size());
    }
    @Test
    public void testRemoveOneEmployeeFromEmptyTeam(){
        EmployeeTeam employeeTeam = new EmployeeTeam();
        Employee vitalik = new BackEnd("Vitalik", "Vozak");
        employeeTeam.removeEmployeeFromTeam2(vitalik);
        Assertions.assertEquals(0,employeeTeam.size());
    }
}
