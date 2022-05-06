package com.company;

import java.util.Arrays;

public class FigureSort {
    private Figure[] figures;

    public FigureSort(Figure[] figures) {
        this.figures = figures;
    }

    public void sortArea(){
        Arrays.sort (this.figures);
    }
}
