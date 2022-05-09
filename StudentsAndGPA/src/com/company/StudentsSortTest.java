package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StudentsSortTest {
    @Test
    public void testSortByName() {
        Students student1 = new Students("Dasha", 1985, 3.86);
        Students student2 = new Students("Vasia", 1997, 4.88);
        Students student3 = new Students("Alena", 1978, 5.00);
        Students[] students = {student1, student2, student3};
        StudentsSort sorter = new StudentsSort(students);
        sorter.sortStudents(new NameComparator());
        Assertions.assertEquals(students[0], student3);
        Assertions.assertEquals(students[1], student1);
        Assertions.assertEquals(students[2], student2);
    }

    @Test
    public void testSortByYearOfBirthday() {
        Students student1 = new Students("Dasha", 1985, 3.86);
        Students student2 = new Students("Vasia", 1997, 4.88);
        Students student3 = new Students("Alena", 1978, 5.00);
        Students[] students = {student1, student2, student3};
        StudentsSort sorter = new StudentsSort(students);
        sorter.sortStudents(new YearOfBirthdayComparator());
        Assertions.assertEquals(students[0], student3);
        Assertions.assertEquals(students[1], student1);
        Assertions.assertEquals(students[2], student2);
    }

    @Test
    public void testSortByGPA() {
        Students student1 = new Students("Dasha", 1985, 3.86);
        Students student2 = new Students("Vasia", 1997, 4.88);
        Students student3 = new Students("Alena", 1978, 3.00);
        Students[] students = {student1, student2, student3};
        StudentsSort sorter = new StudentsSort(students);
        sorter.sortStudents(new GPAComparator());
        Assertions.assertEquals(students[0], student3);
        Assertions.assertEquals(students[1], student1);
        Assertions.assertEquals(students[2], student2);
    }
}
