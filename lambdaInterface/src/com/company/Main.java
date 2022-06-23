package com.company;

public class Main {

    public static void main(String[] args) {
	/* Написать следующие лямбды и интерфейсы, которые они будут использовать:
	1.конкатинировать строки a и b=ab
	2.ecли длина строки = 3 вернуть true иначе false
	3.ecли длина строки = 4 вернуть true иначе false
	4.вернуть строку в верхнем регистре
	5.если длина строки 4 вернуть четыре звездочки иначе вернуть строку без изменений
	6.распечатать строку в виде !строка!
	7.печатает "Hello World"
	интерфейсы: Cheсkable, Printable, Producable,StringConcate,Transformable
	(для некоторых выражений используется один и тот же интерфейс) */

        System.out.println("Task 1 ------------------------");
        StringConcate stringConcate = (a, b) -> a + b;
        System.out.println(stringConcate.concate("a", "b"));

        System.out.println("Task 2 ------------------------");
        Cheсkable check3 = (str) -> str.length()==3;
        System.out.println(check3.check("dog"));
        System.out.println(check3.check("bird"));

        System.out.println("Task 3 ------------------------");
        Cheсkable check4 = (str) -> str.length()==4;
        System.out.println(check4.check("dog"));
        System.out.println(check4.check("bird"));

        System.out.println("Task 4 ------------------------");
        Transformable transformableUpper = (str) -> str.toUpperCase();
        System.out.println(transformableUpper.transformable("dog"));

        System.out.println("Task 5 ------------------------");
        Transformable transformableStars = (str) ->
                str.length()==4?"****":str;
        System.out.println(transformableStars.transformable("dog"));
        System.out.println(transformableStars.transformable("bird"));

        System.out.println("Task 6 ------------------------");
        Printable printable = (str) -> System.out.println("!" + str + "!");
        printable.print("string");

        System.out.println("Task 7 ------------------------");
        Producable producable = () -> System.out.println("Hello world");
        producable.result();
    }
}
