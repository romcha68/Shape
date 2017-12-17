package com.brainacad.oop.testshapes;

/**
 * Created by User on 01.12.2017.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String colorShape, double width, double height) {
        super(colorShape);
        this.width = width;
        this.height = height;
    }
/*
    public static Rectangle parseRectangle(String args) {
        String[] params = args.split(":");
        String[] sizes = params[2].split(",");
        double a = Double.parseDouble(sizes[0]);
        double b = Double.parseDouble(sizes[1]);
        return new Rectangle(params[1], a, b);
    }
*/
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "width = " +
                width + ", height = " + height;
    }
}
