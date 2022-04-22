package com.company;

public class StringToUpperCaseTransformer {
    private String str;

    public StringToUpperCaseTransformer(String str) {
        this.str = str;
    }

    public String getTransformedString (){
        if (str == null) return "";
        return str.toUpperCase();
}

}


