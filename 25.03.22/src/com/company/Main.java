package com.company;

public class Main {

    public static void main(String[] args) {
	/* 1.Создать классы содержащие методы для подсчета площади прямоугольника квадарата и круга.
	Кроме результата подсчета должно выводиться также название соответствующей фигуры.
	Создать массив таких обьектов и вывести его на экран:
	Прямоугольник1 имеет площкдь 50
	Круг имеет площадь 20 */

        AreaOfCircle circle1 = new AreaOfCircle(3,"Circle");
        System.out.println(circle1.toString());

        AreaOfRectangle rectangle1 = new AreaOfRectangle(2, 4, "Rectangle");
        System.out.println(rectangle1.toString());

        AreaOfSquare square1 = new AreaOfSquare(3, "Square");
        System.out.println(square1.toString());

    }
}
