package com.company;

import java.util.Comparator;

public class AnimalNameComparatorLastLetter implements Comparator<Animal> {
    public int compare(Animal a, Animal b){
        return a.getName().charAt(a.getName().length() - 1) - b.getName().charAt(b.getName().length() - 1);
        //return a.getName().substring(a.getName().length() - 1).compareTo(b.getName().substring(b.getName().length() - 1));
    }
}
