package com.company;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("1: " +
                Stream.of("qwe1", "qwe2", "qwe3", "qwe4")
                        .collect(Collectors.toUnmodifiableList()));

        System.out.println("2: " +
                Stream.of("qwe11", "qwe2", "qwe33432", "qwe664")
                        .collect((Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(String::length))))));

        System.out.println("3: " +
                Stream.of("qwe1", "qwe2", "qwe3", "qwe4")
                        .collect(Collectors.joining()));

        System.out.println("4: " +
                Stream.of("qwe1", "qwe2", "qwe3", "qwe4")
                        .collect(Collectors.collectingAndThen(
                                Collectors.toCollection(TreeSet::new),
                                s -> s.tailSet("qwe3"))));

        System.out.println("5: " +
                Stream.of("qwe1", "qwe2", "qwe3", "qwe4")
                        .collect(Collectors.toMap(s -> s, s -> s.length())));

        System.out.println("6: " +
                Stream.of("qwe1", "qe", "qwe", "qwe4")
                        .collect(Collectors.toMap(s -> s.length(), s -> s,
                                (s, s1) -> s1 + "/" + s)));

        System.out.println("7: " +
                Stream.of("qwe1", "qe", "qwe", "qwe4")
                        .collect(Collectors.groupingBy(String::length)));

        System.out.println("8: " +
                Stream.of("qwe1", "qe", "qwe", "qwe4")
                        .collect(Collectors.groupingBy(String::length, Collectors.toSet())));

        System.out.println("9: " +
                Stream.of("qwe1", "qe", "qw88e", "qwe4")
                        .collect(Collectors.partitioningBy(s -> s.length() > 4)));

        System.out.println("10: " +
                Stream.of("qwe1", "qe", "qw88e", "qwe4")
                        .collect(Collectors.partitioningBy(s -> s.length() > 4, Collectors.toSet())));

        System.out.println("11: " +
                Stream.of("qwe1", "qe", "qw88e", "qwe4")
                        .collect(Collectors.mapping(s -> s.toUpperCase(), Collectors.toList())));

        System.out.println("12: " +
                Stream.of(1, 2, 3, 4)
                        .collect(Collectors.teeing(
                                Collectors.minBy(Comparator.comparing(Integer::intValue)),
                                Collectors.averagingInt(Integer::intValue),
                                (min, avg) -> {
                                    return avg - min.get();
                                })));
    }
}
