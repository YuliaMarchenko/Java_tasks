package com.company;

public class Main {

    public static void main(String[] args) {
	/* 1. Create a class MyDate with the following fields: int day, int month, int year.
	a. Implement the constructor method. It should take three integer arguments.
	b. Implement String toString() method, that returns the String something like “21-15-2022”*/

        MyDate myDate = new MyDate(1,4,1966);
        System.out.println(myDate);

	/* 2. Create a class Person with following fields: String firstName, String lastName, MyDate birthday.
	a. Implement the constructor method.
	b. Implement String toString() method, that returns the String something like “Ivanov Ivan [21-15-2022]”*/

        Person person = new Person("Ivanov", "Ivan", myDate);
        System.out.println(person);

	/* 3. Create a class Practice with following fields: String subject , Person trainee, Person tutor, MyDate dateStart, MyDate dateFinish.
	a. Implement the constructor method.
	b. Implement String toString() method, that returns the String info about Practice.*/

        MyDate traineeDate = new MyDate(11, 1, 1990);
        Person trainee = new Person("Kostuk", "Daria", traineeDate);

        MyDate tutorDate = new MyDate(31, 3, 1955);
        Person tutor = new Person("Petrov", "Vasia", tutorDate);

        MyDate dateStart = new MyDate(14, 03, 2022);
        MyDate dateFinish = new MyDate(13, 04, 2023);

        Practice practice = new Practice("Math", trainee, tutor, dateStart, dateFinish);
        System.out.println(practice);
    }
}
