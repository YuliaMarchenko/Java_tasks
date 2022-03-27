package com.company;

public class BackEnd extends Programmer {

    public BackEnd(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String doWork() {
        return String.format("%s improves backend.", super.doWork());
    }
}
