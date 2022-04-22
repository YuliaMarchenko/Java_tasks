package com.company;

public class ChangeWith5 extends ChangeString {
    public ChangeWith5(String str) {
        super(str);
    }

    @Override
    public String getNewStr() {
        String[] result = str.split(" ");
        for (int i = 0; i < result.length; i++) {
            if (result[i].length() == 5) {
                result[i] = "*****";
            }
        }
        return String.join(" ", result);
    }
}
