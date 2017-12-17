package com.brainacad.oop.testshapes;

import java.util.Comparator;

public class AreaComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Shape s1 = (Shape)o1;
        Shape s2 = (Shape)o2;
        if(s1.calcArea() > s2.calcArea())
            return 1;
        if(s1.calcArea() == s2.calcArea())
            return 0;
        return -1;
    }
}
