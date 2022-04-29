package com.company;

public class ChangeUpperCase implements Transformer{

    @Override
    public String transform(String str) {
        String[] result = str.split(" ");
        for (int i = 0; i < result.length; i++){
            if (result[i].length() == 3) {
                result[i] = result[i].toUpperCase();
            }
        }
        return String.join(" ", result);
    }
}
