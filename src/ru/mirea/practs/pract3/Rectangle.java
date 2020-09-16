package ru.mirea.practs.pract3;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        super();
        this.width = 0.0;
        this.length = 0.0;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Rectangle is "+this.color+" and filled: "+this.filled+". The area is "+getArea()+
                ". The perimeter is "+ getPerimeter()+".";
    }
}
