package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class StudentsSort {
    private Students[] students;

    public StudentsSort(Students[] students){
        this.students = students;
    }

    public void sortStudents(Comparator<Students> comparator){
        Arrays.sort(this.students, comparator);
    }
}
