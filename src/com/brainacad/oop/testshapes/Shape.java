package com.brainacad.oop.testshapes;

/**
 * Created by User on 01.12.2017.
 */
public class Shape {
    private String shapeColor;

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ", " +
                "color is: " + shapeColor;
    }
    public double calcArea(){
        return 0.0;
    }
}
