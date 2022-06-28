package com.company;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	/* 1. Есть два класса Group {String title, List<Student>}, Student{String name, List<Double> payments}.
	Необходимо написать метод, который вернет список всех студентов.
	Учтите, что один и тот же студент может посещать несколько групп.

	2. Есть два класса Group {String title, List<Student>}, Student{String name, List<Double> payments}.
	Необходимо написать метод, который вернет сумму всех платежей, т.е. общий доход.

	3. Есть два класса Group {String title, List<Student>}, Student{String name, List<Double> payments}.
	Необходимо написать метод, который вернет студентов, сумма платежей которых меньше заданной суммы.

	4. Используя Stream получить лист c первыми 20 числами Фибоначчи.*/
    }

    public static List<Student> getStudents(List<Group> groups) {
        return groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static double getTotalIncome(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getPayments().stream())
                .reduce(0.0, Double::sum);
    }

    public static List<Student> getStudentsWithPaymentLessSum(List<Student> students, double sum) {
        return students.stream()
                .filter(student -> student.sumPayments() < sum)
                .collect(Collectors.toList());
    }

    public static List<Integer> getFibonacciNumbers() {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .collect(Collectors.toList());
    }
}
