package com.company;

public class ChangeWith3 extends ChangeString {
    public ChangeWith3(String str) {
        super(str);
    }

    @Override
    public String transform(String word) {
        if (word.length() == 3) {
            return word.toUpperCase();
        }
        return word;
    }
}