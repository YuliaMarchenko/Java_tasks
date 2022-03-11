package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Petr", 2);
        Student student2 = new Student("Daria", 3);
        Student student3 = new Student("Vasia", 1);

       new Triangle();
       new TriangleWithSide();

       Rectangle sides1 = new Rectangle(4,5);
       Rectangle sides2 = new Rectangle(5,8);

       Average average1 = new Average(2,3,4);
       Average average2 = new Average(8,3,4);

       Employee employee1 = new Employee(2000, 3);
       Employee employee2 = new Employee(400, 3);
       Employee employee3 = new Employee(2000, 7);
    }
}
