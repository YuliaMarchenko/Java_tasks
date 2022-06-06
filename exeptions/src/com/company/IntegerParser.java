package com.company;

import java.util.ArrayList;
import java.util.List;

public class IntegerParser {
    private List<Integer> correctData = new ArrayList<>();
    private List<String> errors = new ArrayList<>();

    public List<Integer> getCorrectData() {
        return correctData;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void parse(List<String> input) {
        for (String s : input) {
            try {
                correctData.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                errors.add(s + " incorrect");
            }
        }
    }
}
