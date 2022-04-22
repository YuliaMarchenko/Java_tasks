package com.company;

public class ChangeWith3 extends ChangeString {
    public ChangeWith3(String str) {
        super(str);
    }

    @Override
    public String getNewStr() {
        String[] result = str.split(" ");
        for (int i = 0; i < result.length; i++){
            if (result[i].length()==3) {
                result[i] = result[i].toUpperCase();
            }
        }
        return String.join(" ", result);
    }
}