package com.company;

public class Class1A extends Person {
    private int dateOfBirth;
    private int GPA;

    public Class1A(String name, String surname, int dateOfBirth, int GPA) {
        super(name, surname);
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Class1A{" +
                "dateOfBirth=" + dateOfBirth +
                ", GPA=" + GPA +
                '}';
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void showClass1A(){
        System.out.println(String.format("The pupil %s %s, who was born in %d and is studying in class 1A", getName(), getSurname(),getDateOfBirth()));
    }
}
