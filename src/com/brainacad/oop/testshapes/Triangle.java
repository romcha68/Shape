package com.brainacad.oop.testshapes;

/**
 * Created by User on 01.12.2017.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String colorShape, double a, double b, double c){
        super(colorShape);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calcArea(){
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public String toString(){
        return super.toString();
    }
}
