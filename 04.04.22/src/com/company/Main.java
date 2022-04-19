package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Vasia", "Pupkin", 566467);
        Person p2 = new Person("Vasia", "Pupkin", 566467);

        if (p1 == p2) {
            System.out.println("'это один Вася");
        } else {
            System.out.println("это разный Вася");
        }

        if (p1.equals(p2)) {
            System.out.println("это один Вася");
        } else {
            System.out.println("это разный Вася");
        }

    }
}
