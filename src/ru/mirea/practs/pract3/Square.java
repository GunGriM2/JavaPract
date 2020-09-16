package ru.mirea.practs.pract3;

public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(double side) {
        super();
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled) {
        super();
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square is "+this.color+" and filled: "+this.filled+". The area is "+getArea()+"." +
                " The perimeter is "+ getPerimeter()+".";
    }
}
