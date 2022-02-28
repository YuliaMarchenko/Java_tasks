package com.company;

public class Main {

    public static void main(String[] args) {

	/* Given two arrays. The first is String[n] students – names of students.
	The second is int[n][] grades – the array of grades for student homework.
	Every row of grades array is one student's grades (grades[k] is the grades of students[k]).
	Note, that each student has a different number of grades.
	You should implement the program that finds and displays the student with highest GPA and the score.
	Example:{Jack, Nick} { { 3,4,2}, { 5,5,5,4} } -> Nick 4.75

	In previous task you should print students sorted by GPA. */

        String[] students = {"Jack", "Nick", "John" };
        int[][] grades = {{5, 1, 3}, {5, 5, 5, 5}, {5, 1, 3, 5, 5, 5, 5, 5}};
        double[] gpa = getGPA(grades);
        getBestStudent(gpa, students);
        sortStudentGPA(gpa, students);
        printSortStudentGPA(gpa, students);
    }

    public static double[] getGPA(int[][] grades) {
        double[] gpa = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                gpa[i] += grades[i][j];
            }
            gpa[i] /= grades[i].length;
        }
        return gpa;
    }

    public static void getBestStudent(double[] gpa, String[] students) {
        double maxGPA = gpa[0];
        int index = 0;
        for (int i = 1; i < gpa.length; i++) {
            if (gpa[i] > maxGPA) {
                maxGPA = gpa[i];
                index = i;
            }
        }
        System.out.println(String.format("Best student is %s with grade %.2f", students[index], maxGPA));
    }

    public static void sortStudentGPA(double[] gpa, String[] students) {
        for (int j = 0; j < gpa.length; j++)
            for (int i = 1; i < gpa.length - j; i++) {
                if (gpa[i - 1] < gpa[i]) {
                    double tmp = gpa[i - 1];
                    gpa[i - 1] = gpa[i];
                    gpa[i] = tmp;
                    String tmpStr = students[i - 1];
                    students[i - 1] = students[i];
                    students[i] = tmpStr;
                }
            }
    }

    public static void printSortStudentGPA(double[] gpa, String[] students) {
        for (int i = 0; i < gpa.length; i++) {
            System.out.println(students[i] + " " + gpa[i]);
        }
    }
}
