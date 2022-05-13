package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressListTest {
    @Test
    public void testGetAddressList() {
        Address address1 = new Address("Erich street", 12);
        Address address2 = new Address("Leningradskay street", 13);
        Person person1 = new Person("Vasia", address1);
        Person person2 = new Person("Daria", address2);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        List<Address> addressList = new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);
        Assertions.assertArrayEquals(addressList.toArray(), AddressList.getAddresses(personList).toArray());
    }
}
