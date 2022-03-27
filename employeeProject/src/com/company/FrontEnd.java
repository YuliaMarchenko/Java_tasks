package com.company;

public class FrontEnd extends Programmer {

    public FrontEnd(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String doWork() {
        return String.format("%s and implements new features.", super.doWork());
    }
}
