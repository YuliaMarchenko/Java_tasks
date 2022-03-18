package com.company;

import java.util.Arrays;

public class AddressGetter {
    private Person[] people;

    public AddressGetter(Person[] people) {
        this.people = people;
    }

    public String toString() {
        return Arrays.toString(people);
    }

    public Address[] getAddresses() {
        Address [] addresses = new Address[people.length];
        for (int i=0; i<people.length; i++){
            addresses[i] = people[i].getAddress();
        }
        return addresses;
    }
}


