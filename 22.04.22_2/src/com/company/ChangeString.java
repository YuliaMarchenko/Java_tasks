package com.company;

public abstract class ChangeString {
    protected String str;

    public ChangeString(String str) {
        this.str = str;
    }

    public abstract String getNewStr();
}


