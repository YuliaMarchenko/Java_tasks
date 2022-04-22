package com.company;

import java.util.Locale;

public class ChangeWith4 extends ChangeString {
    public ChangeWith4(String str) {
        super(str);
    }

    @Override
    public String getNewStr() {
        String[] result = str.split(" ");
        for (int i = 0; i < result.length; i++){
            if (result[i].length()==4) {
                result[i] = result[i].toLowerCase();
            }
        }
        return String.join(" ", result);
    }
}
