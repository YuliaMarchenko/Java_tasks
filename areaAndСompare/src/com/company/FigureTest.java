package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FigureTest {

    @Test
    public void testCompareToTwoCircleFigure(){
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        Assertions.assertTrue(circle1.compareTo(circle2) < 0);
    }

    @Test
    public void testCompareToTwoFigureCircleRectangle(){
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(5,6);
        Assertions.assertTrue(circle.compareTo(rectangle) < 0);
    }
}
