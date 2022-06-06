package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class IntegerParserTest {
    @Test
    public void testIntegerParserOneError() {
        IntegerParser integerParser = new IntegerParser();
        List<String> input = Arrays.asList("1", "3", "0", "Vasia", "10");
        List<Integer> expectedResult = Arrays.asList(1, 3, 0, 10);
        List<String> expectedError = Arrays.asList("Vasia incorrect");
        integerParser.parse(input);
        Assertions.assertEquals(expectedResult, integerParser.getCorrectData());
        Assertions.assertEquals(expectedError, integerParser.getErrors());
    }

    @Test
    public void testIntegerParserAllGood() {
        IntegerParser integerParser = new IntegerParser();
        List<String> input = Arrays.asList("1", "3", "0", "10");
        List<Integer> expectedResult = Arrays.asList(1, 3, 0, 10);
        List<String> expectedError = Arrays.asList();
        integerParser.parse(input);
        Assertions.assertEquals(expectedResult, integerParser.getCorrectData());
        Assertions.assertEquals(expectedError, integerParser.getErrors());
    }

    @Test
    public void testIntegerParserTwoError() {
        IntegerParser integerParser = new IntegerParser();
        List<String> input = Arrays.asList("1", "3", "0", "10", "some", "kiwi");
        List<Integer> expectedResult = Arrays.asList(1, 3, 0, 10);
        List<String> expectedError = Arrays.asList("some incorrect", "kiwi incorrect");
        integerParser.parse(input);
        Assertions.assertEquals(expectedResult, integerParser.getCorrectData());
        Assertions.assertEquals(expectedError, integerParser.getErrors());
    }

    @Test
    public void testIntegerParserAllError() {
        IntegerParser integerParser = new IntegerParser();
        List<String> input = Arrays.asList("some", "kiwi");
        List<Integer> expectedResult = Arrays.asList();
        List<String> expectedError = Arrays.asList("some incorrect", "kiwi incorrect");
        integerParser.parse(input);
        Assertions.assertEquals(expectedResult, integerParser.getCorrectData());
        Assertions.assertEquals(expectedError, integerParser.getErrors());
    }
}
