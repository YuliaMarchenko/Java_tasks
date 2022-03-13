package com.company;

public class Practice {
    String subject;
    Person trainee;
    Person tutor;
    MyDate dateStart;
    MyDate dateFinish;

    public Practice(String subject, Person trainee, Person tutor, MyDate dateStart, MyDate dateFinish){
        this.subject = subject;
        this.trainee = trainee;
        this.tutor = tutor;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
    }

    public String toString(){
        return String.format("Subject: %s; Trainee: %s; Tutor: %s; Date start: %s; Date finish: %s", this.subject, this.trainee, this.tutor,  this.dateStart, this.dateFinish);
    }
}
