package com.company;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create new class Students with following fields (String name, int yearOfBirthday, double gpa).
        // Create the array of several students. Your program should ask user how to sort students (by name, by age, or by gpa)
        // and display students accordingly

        Students student1 = new Students("Dasha", 1985, 3.86);
        Students student2 = new Students("Vasia", 1997, 4.88);
        Students student3 = new Students("Alena", 1978, 5.00);
        Students[] students = {student1, student2, student3};

        System.out.println("How to sort students?");
        System.out.println("1 - by name, 2 - by age, 3 - by gpa");
        Scanner sc = new Scanner(System.in);
        int enteredValueSort = sc.nextInt();
        StudentsSort studentsSort = new StudentsSort(students);
        Comparator<Students> comp = new StudentsSortFactory().buildComparator(enteredValueSort);
        studentsSort.sortStudents(comp);
        sc.close();

        for (Students student:students) {
            System.out.println(student.getName() + " " + student.getYearOfBirthday() + " " + student.getGpa());
        }
    }
}
