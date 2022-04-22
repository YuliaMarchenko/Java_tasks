package com.company;

import java.util.Locale;

public class ChangeWith4 extends ChangeString {
    public ChangeWith4(String str) {
        super(str);
    }

    @Override
    public String transform(String word) {
        if (word.length() == 3) {
            return word.toLowerCase();
        }
        return word;
    }
}
