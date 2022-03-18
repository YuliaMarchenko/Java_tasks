package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /* 1.create class Dog ,create several dog objects and print the number of objects created on the screen.
        Each Dog should have name and age. Add getters and setters. All variables should be private.
        Setter method for dog's age should not allow negative age.*/

        Dog dogTuzik = new Dog("Tuzik", 3);
        Dog dogMurzik = new Dog("Murzik", 6);
        Dog dogPesik = new Dog("Pesik", 4);
        System.out.println("Number of dogs: " + Dog.counter);
        dogMurzik.setAge(7);
        System.out.println(dogTuzik);
        System.out.println(dogMurzik);
        System.out.println(dogPesik);

        /* 2.Create two classes: Address with the fields street and houseNumber, constructor etc.
        and Person with fields name and address, constructor, getters etc.
        Create the third class AddressGetter which accepts an array of persons and returns an array of their addresses.*/

        Address addressDaria = new Address("Pushkinskai", 3);
        Person daria = new Person("Daria", addressDaria);
        Address addressVasia = new Address("Leningradskai", 5);
        Person vasia = new Person("Vasia", addressVasia);
        Address addressSophia = new Address("Sovetskaia", 15);
        Person sophia = new Person("Sophia", addressSophia);

        Person[] persons = {daria, vasia, sophia};
        AddressGetter addressGetter = new AddressGetter(persons);
        System.out.println(addressGetter);
        System.out.println(Arrays.toString(addressGetter.getAddresses()));
    }
}
