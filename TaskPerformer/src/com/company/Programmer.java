package com.company;

import java.util.List;

public class Programmer {
    String name;
    List<String> technology;

    public Programmer(String name, List<String> technology) {
        this.name = name;
        this.technology = technology;
    }

    public String getName() {
        return name;
    }

    public List<String> getTechnology() {
        return technology;
    }
}
