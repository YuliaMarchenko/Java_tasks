package com.company;

import java.util.Comparator;

public class Person {

    private class Date implements Comparable<Date> {
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
            flag = true;
        }

        @Override
        public String toString() {
            return day + "-" + month + "-" + year;
        }

        @Override
        public int compareTo(Date o) {
            return 1000 * (this.year - o.year) + 30 * (this.month - o.month) + (this.day - o.day);
        }
    }

    private String fName;
    private String lName;
    private Date birthday;
    private boolean flag = false;

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public void setBirthday(int day, int month, int year){
        this.birthday = new Date(day, month, year);
    }

    @Override
    public String toString(){
        return fName + " " + lName + " (" + birthday + ")";
    }

    public static Comparator<Person> comparingByFirstName(){

        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.fName.compareTo(o2.fName);
            }
        };
    }

    public static Comparator<Person> comparingByAge(){

        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.birthday.compareTo(o2.birthday);
            }
        };
    }
}

