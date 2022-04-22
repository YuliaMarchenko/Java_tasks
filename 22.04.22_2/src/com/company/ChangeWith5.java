package com.company;

public class ChangeWith5 extends ChangeString {

    @Override
    public String transform(String word) {
        if (word.length() == 5) {
            return "*****";
        }
        return word;
    }
}
