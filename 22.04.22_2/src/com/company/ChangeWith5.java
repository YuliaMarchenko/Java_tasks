package com.company;

public class ChangeWith5 extends ChangeString {
    public ChangeWith5(String str) {
        super(str);
    }

    @Override
    public String transform(String word) {
        if (word.length() == 5) {
            return "*****";
        }
        return word;
    }
}
