package com.company;

import java.util.List;

public class Group {
    String title;
    List<Student> students;

    public Group(String title, List<Student> students) {
        this.title = title;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudents() {
        return students;
    }
}
