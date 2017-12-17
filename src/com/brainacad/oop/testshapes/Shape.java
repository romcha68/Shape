package com.brainacad.oop.testshapes;

/**
 * Created by User on 01.12.2017.
 */
public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public int compareTo(Object object) {
        if (this.calcArea() > ((Shape) object).calcArea())
            return 1;
        if (this.calcArea() == ((Shape) object).calcArea())
            return 0;
        return -1;
    }
/*
    public static Shape parseShape(String args) {
        String[] params = args.split(":");
        switch (params[0].toLowerCase()) {
            case ("rectangle"):
                return Rectangle.parseRectangle(args);
            case ("triangle"):
                return Triangle.parseTriangle(args);
            default:
                return Circle.parseCircle(args);
        }
    }
*/
    @Override
    public void draw() {
        System.out.println("This is " + this.toString());
        System.out.println("Area is " + calcArea());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", " +
                "color is: " + shapeColor;
    }

    public abstract double calcArea();
}
