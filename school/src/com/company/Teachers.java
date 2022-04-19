package com.company;

public class Teachers extends Person{
    private String subject;

    public Teachers(String name, String surname, String subject) {
        super(name, surname);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void showTeacher (){
        System.out.println(String.format("The teacher %s %s who teaches %s", getName(), getSurname(),getSubject()));
    }
}
