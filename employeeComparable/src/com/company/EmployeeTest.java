package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

    private List<Employee> employeeList;
    private Employee vasia;
    private Employee daria;
    private Employee kuzia;
    private Employee andrey;


    @BeforeEach
    void init() {
        vasia = new Employee(3, "Vasia", 30, 38000);
        daria = new Employee(2, "Daria", 35, 15000);
        kuzia = new Employee(1, "Kuzia", 45, 15800);
        andrey = new Employee(4, "Andrey", 35, 23700);
        employeeList = new ArrayList<>();
        employeeList.add(vasia);
        employeeList.add(daria);
        employeeList.add(kuzia);
        employeeList.add(andrey);
    }

    @Test
    public void testCompareById() {
        Employee[] expected = {kuzia, daria, vasia, andrey};
        Collections.sort(employeeList);
        Assertions.assertArrayEquals(expected, employeeList.toArray());
    }

    @Test
    public void testAgeComparator() {
        Employee[] expected = {vasia, daria, andrey, kuzia};
        Collections.sort(employeeList, new AgeComparator());
        Assertions.assertArrayEquals(expected, employeeList.toArray());
    }

    @Test
    public void testNameComparator() {
        Employee[] expected = {andrey, daria, kuzia, vasia};
        Collections.sort(employeeList, new NameComparator());
        Assertions.assertArrayEquals(expected, employeeList.toArray());
    }

    @Test
    public void testSalaryComparator() {
        Employee[] expected = {daria, kuzia, andrey, vasia};
        Collections.sort(employeeList, new SalaryComparator());
        Assertions.assertArrayEquals(expected, employeeList.toArray());
    }

    @Test
    public void testAgeNameComparator() {
        Employee[] expected = {vasia, andrey, daria, kuzia};
        Collections.sort(employeeList, new AgeNameComparator());
        Assertions.assertArrayEquals(expected, employeeList.toArray());
    }

    @Test
    public void testReturnNameComparator() {
        EmployeeSortFactory subject = new EmployeeSortFactory();
        Assertions.assertInstanceOf(NameComparator.class, subject.buildComparator(1));
    }

    @Test
    public void testReturnAgeComparator() {
        EmployeeSortFactory subject = new EmployeeSortFactory();
        Assertions.assertInstanceOf(AgeComparator.class, subject.buildComparator(2));
    }

    @Test
    public void testReturnSalaryComparator() {
        EmployeeSortFactory subject = new EmployeeSortFactory();
        Assertions.assertInstanceOf(SalaryComparator.class, subject.buildComparator(3));
    }

    @Test
    public void testReturnAgeNameComparator() {
        EmployeeSortFactory subject = new EmployeeSortFactory();
        Assertions.assertInstanceOf(AgeNameComparator.class, subject.buildComparator(4));
    }
}
