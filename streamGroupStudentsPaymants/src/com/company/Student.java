package com.company;

import java.util.List;

public class Student {
    String name;
    List<Double> payments;

    public Student(String name, List<Double> payments) {
        this.name = name;
        this.payments = payments;
    }

    public String getName() {
        return name;
    }

    public List<Double> getPayments() {
        return payments;
    }

    public double sumPayments(){
        return payments.stream()
                .reduce(0.0, Double::sum);
    }

}
