package com.company;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Есть класс Person с переменными name, salary. Написать коллектор, считающий суммарную зп всех сотрудников.

        Person p1 = new Person("Ivan", 1500);
        Person p2 = new Person("Sofia", 3000);
        Person p3 = new Person("Petr", 1800);
        Person p4 = new Person("Luba", 1200);
        Person p5 = new Person("Sergey", 4500);

        Supplier<Box> supp = () -> {
            System.out.println("Supplying starting value");
            return new Box(0);
        };

        BiConsumer<Box, Person> accumulator = (result, person) -> {
            result.setValue(result.getValue() + person.getSalary());
            System.out.println(result.getValue() + " " + person.getName());
        };

        BinaryOperator<Box> combiner = (res1, res2) -> {
            System.out.println("Combinig result ");
            res1.setValue(res1.getValue() + res2.getValue());
            return res1;
        };

        Collector<Person, Box, Box> collector = Collector.of(
                supp,
                accumulator,
                combiner
        );

        Box box = Stream.of(p1, p2, p3, p4, p5)
                .parallel()
                .collect(collector);

        System.out.println("Total salary = " + box);
    }
}
