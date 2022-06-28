package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    public void testGetStudents() {
        Student student1 = new Student("Daria", Arrays.asList(120.0, 245.8, 90.0));
        Student student2 = new Student("Petr", Arrays.asList(120.0, 20.7));
        Student student3 = new Student("Vitalik", Arrays.asList(80.0, 1245.8, 90.0));
        Student student4 = new Student("Sofia", Arrays.asList(110.0, 24.0));
        List<Group> groups = Arrays.asList(new Group("Math", Arrays.asList(student1, student2, student3)),
                new Group("literature", Arrays.asList(student2, student3, student4)));
        List<Student> result = Arrays.asList(student1, student2, student3, student4);
        Assertions.assertEquals(result, Main.getStudents(groups));
    }

    @Test
    public void testGetTotalIncome() {
        List<Student> students = Arrays.asList(
                new Student("Daria", Arrays.asList(120.0, 245.8, 90.0)),
                new Student("Petr", Arrays.asList(240.0, 120.0)));
        Assertions.assertEquals(815.8, Main.getTotalIncome(students));
    }

    @Test
    public void testStudentsWithPaymentLessSum() {
        Student student1 = new Student("Daria", Arrays.asList(120.0, 245.8, 90.0));
        Student student2 = new Student("Petr", Arrays.asList(120.0, 20.7));
        Student student3 = new Student("Vitalik", Arrays.asList(80.0, 1245.8, 90.0));
        Student student4 = new Student("Sofia", Arrays.asList(110.0, 24.0));
        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        List<Student> result = Arrays.asList(student2, student4);
        Assertions.assertEquals(result, Main.getStudentsWithPaymentLessSum(students, 150.0));
    }

    @Test
    public void testGetFibonacciNumbers() {
        List<Integer> fibonacciNumbers = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        Assertions.assertEquals(fibonacciNumbers, Main.getFibonacciNumbers());
    }
}
