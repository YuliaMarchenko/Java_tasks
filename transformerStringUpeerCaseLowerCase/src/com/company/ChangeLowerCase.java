package com.company;

public class ChangeLowerCase implements Transformer{

    @Override
    public String transform(String str) {
        String[] result = str.split(" ");
        for (int i = 0; i < result.length; i++){
            if (result[i].length() == 2) {
                result[i] = result[i].toLowerCase();
            }
        }
        return String.join(" ", result);
    }
}

