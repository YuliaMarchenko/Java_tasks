package com.company;

public class Pet extends Animal {
    private String owner;

    public Pet(String name, int weight, String colour, String owner) {
        super(name, weight, colour);
        this.owner = owner;
    }


}
