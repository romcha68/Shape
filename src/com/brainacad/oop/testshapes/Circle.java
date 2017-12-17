package com.brainacad.oop.testshapes;

/**
 * Created by User on 01.12.2017.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String colorShape, double radius){
        super(colorShape);
        this.radius = radius;
    }

    public static Circle parseCircle(String args) {
        String[] params = args.split(":");
        String[] sizes = params[2].split(",");
        double r = Double.parseDouble(sizes[0]);
        return new Circle(params[1], r);
    }

    @Override
    public double calcArea() {
        return Math.pow(radius,2) * 3.14;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + "radius=" + radius;
    }
}
