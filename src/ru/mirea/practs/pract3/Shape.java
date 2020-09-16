package ru.mirea.practs.pract3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "The shape is "+this.color+" and filled: "+this.filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

}
