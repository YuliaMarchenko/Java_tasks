package com.company;

public abstract class ChangeString {

    public String getNewStr(String str){
        String[] result = str.split(" ");
        for (int i = 0; i < result.length; i++){
           result[i] = transform(result[i]);
        }
        return String.join(" ", result);
    }

    public abstract String transform (String str);
}


