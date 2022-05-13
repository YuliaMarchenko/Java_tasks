package com.company;

import java.util.ArrayList;
import java.util.List;

public class AddressList {

    public static List<Address> getAddresses(List<Person> personList) {
        List<Address> addressList = new ArrayList<>();
        for (Person person : personList) {
            addressList.add(person.getAddress());
        }
        return addressList;
    }
}
