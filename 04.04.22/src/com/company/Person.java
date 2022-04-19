package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int inn;

    public Person(String firstName, String lastName, int inn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.inn = inn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (inn != person.inn) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + inn;
        return result;
    }

    @Override
    public String toString() {
        return String.format("First name: %s, last name: %s, inn: %d", firstName, lastName, inn);
    }
}
