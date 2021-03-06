package com.brainacad.oop.testshapes;

/**
 * Created by User on 01.12.2017.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String colorShape, double a, double b, double c) {
        super(colorShape);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle parseTriangle(String args) {
        String[] params = args.split(":");
        String[] sizes = params[2].split(",");
        double a = Double.parseDouble(sizes[0]);
        double b = Double.parseDouble(sizes[1]);
        double c = Double.parseDouble(sizes[2]);
        return new Triangle(params[1], a, b, c);
    }

    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return super.toString() + ", a = " + a +
                ", b = " + b + ", c = " + c;
    }
}
