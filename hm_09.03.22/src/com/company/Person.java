package com.company;

public class Person {
    String lastName;
    String firstName;
    MyDate birthday;

    public Person(String lastName, String firstName, MyDate birthday){
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
    }

    public String toString(){
        return String.format("%s %s [%s]",this.lastName, this.firstName, this.birthday);
    }
}
