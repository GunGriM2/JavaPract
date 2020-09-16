package ru.mirea.practs.pract3;

import static java.lang.Math.PI;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super();
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle is "+this.color+" and filled: "+this.filled+". The area is "+getArea()+"." +
                " The perimeter is "+ getPerimeter()+".";
    }
}
