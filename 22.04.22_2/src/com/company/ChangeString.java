package com.company;

public abstract class ChangeString {
    protected String str;

    public ChangeString(String str) {
        this.str = str;
    }

    public String getNewStr(){
        String[] result = str.split(" ");
        for (int i = 0; i < result.length; i++){
           result[i] = transform(result[i]);
        }
        return String.join(" ", result);
    }

    public abstract String transform (String str);
}


