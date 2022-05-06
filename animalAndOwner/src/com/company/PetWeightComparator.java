package com.company;

import java.util.Comparator;

public class PetWeightComparator implements Comparator<Pet> {
    public int compare(Pet a, Pet b){
        return a.getWeight() - b.getWeight();
    }
}
