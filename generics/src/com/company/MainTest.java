package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    public void testCopy() {
        Circle circle = new Circle(3);
        Circle otherCircle = new Circle(5);
        List<Circle> source = Arrays.asList(circle, otherCircle);
        List<Figure> target = new ArrayList<>();
        List<Figure> expected = Arrays.asList(circle, otherCircle);
        Main.copy(source, target);
        Assertions.assertEquals(expected, target);
    }

    @Test
    public void testDeduplicate() {
        List<Integer> list = Arrays.asList(1, 5, 23, 1, 45, 35, 23);
        List<Integer> expected = Arrays.asList(1, 35, 5, 23, 45);
        Assertions.assertEquals(expected, Main.deduplicate(list));
    }

    @Test
    public void testDeduplicate2() {
        List<Integer> list = Arrays.asList(1, 5, 23, 1, 45, 35, 23);
        List<Integer> expected = Arrays.asList(1, 5, 23, 45, 35);
        Assertions.assertEquals(expected, Main.deduplicate2(list));
    }
}
