package com.brainacad.oop.testshapes;

/**
 * Created by User on 01.12.2017.
 */
public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String colorShape, double width, double height){
        super(colorShape);
        this.width = width;
        this.height = height;
    }
    public double calcArea(){
        return width * height;
    }
    public String toString(){
        return super.toString();
    }
}
