package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = List.of("9999", "111", "222", "33", "44");
        strings.stream()
                .filter(s -> s.length() > 2)
                .peek(s -> System.out.println("In stream " + s))
                .sorted()
                .forEach(s -> System.out.println(s));
    }
}
