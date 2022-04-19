package com.company;

public class Main {

    public static void main(String[] args) {
	/*Imagine you are developing a system for on-line shop (or for a hotel or for a school or for a hospital
	or ....... for whatever area you want).
	Implement several classes. Come up with several classes connected by an inheritance relationship.
	 Think about which methods should be implemented in the parent class, which in the descendant classes.*/

        Teachers teachersMath = new Teachers("Maria", "Petrova", "math");
        Class1A misha1A = new Class1A("Misha", "Ivanov", 2015, 3);
        teachersMath.showTeacher();
        misha1A.showClass1A();
    }
}
