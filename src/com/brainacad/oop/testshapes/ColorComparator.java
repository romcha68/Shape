package com.brainacad.oop.testshapes;

import java.util.Comparator;

public class ColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Shape) o1).getShapeColor().compareTo(((Shape) o2).getShapeColor());
    }
}
