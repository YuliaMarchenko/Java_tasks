package com.company;

public class Class9B extends Person {
    private int dateOfBirth;
    private int [] scores;

    public Class9B(String name, String surname, int dateOfBirth, int[] scores) {
        super(name, surname);
        this.dateOfBirth = dateOfBirth;
        this.scores = scores;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
}
