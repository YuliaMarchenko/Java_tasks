package com.company;

import java.util.Locale;

public class ChangeWith4 extends ChangeString {

    @Override
    public String transform(String word) {
        if (word.length() == 4) {
            return word.toLowerCase();
        }
        return word;
    }
}
