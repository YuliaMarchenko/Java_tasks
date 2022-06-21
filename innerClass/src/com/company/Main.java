package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov");
        p1.setBirthday(15, 11, 1985);

        Person p2 = new Person("Vasia", "Sidorov");
        p2.setBirthday(16, 02, 1985);

        Person p3 = new Person("Daria", "Murzikova");
        p3.setBirthday(16, 02, 1986);

        Person p4 = new Person("Ariva", "Shishkina");
        p4.setBirthday(16, 02, 1990);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        System.out.println("List: " + list);
        list.sort(Person.comparingByFirstName());
        System.out.println("Sort by first name: " + list);
        list.sort(Person.comparingByAge());
        System.out.println("Sort by age: " + list);

        Person m = new Person("qw", "qw") {
            @Override
            public String toString() {
                return super.toString() + " hello from anonim";
            }
        };

        System.out.println(m);

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(-4);
        integers.add(5);
        integers.add(-7);
        System.out.println("List integers: " + integers);

        MyPredicate predicate1 = new MyPredicate() {
            @Override
            public boolean test(Integer i) {
                return i < -3 && i % 2 != 0;
            }
        };
        MyFunction func1 = new MyFunction() {
            @Override
            public Integer apply(Integer i) {
                return Integer.valueOf(i + 10);
            }
        };
        listTransform(integers, predicate1, func1);
        System.out.println("New list integers 2: " + integers);

        MyPredicate predicate2 = new MyPredicate() {
            @Override
            public boolean test(Integer i) {
                return i < 0;
            }
        };
        MyFunction func2 = new MyFunction() {
            @Override
            public Integer apply(Integer i) {
                return Math.abs(i);
            }
        };
        listTransform(integers, predicate2, func2);
        System.out.println("New list integers 3: " + integers);

        // MyPredicate predicate3 = (Integer q) -> {return q > 0;};
        // MyPredicate predicate3 = (q) -> q > 0;
        // listTransform(integers, predicate3, func3);
        listTransform(integers, q -> q > 0, h -> h + 100);
        System.out.println("New list integers 4: " + integers);
    }

    public static void listTransform(List<Integer> list, MyPredicate predicate, MyFunction func) {
        for (int i = 0; i < list.size(); i++) {
            Integer temp = list.get(i);
            if (predicate.test(temp.intValue())) {
                list.set(i, func.apply(temp));
            }
        }
    }
}
