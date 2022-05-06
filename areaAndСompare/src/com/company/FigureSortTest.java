package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FigureSortTest {
    @Test
    public void testSortTwoCircleFigure(){
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);
        Figure [] figures = {circle1, circle2};
        FigureSort figureSort = new FigureSort(figures);
        figureSort.sortArea();
        Assertions.assertEquals(figures[0], circle2);
        Assertions.assertEquals(figures[1], circle1);
    }
}
