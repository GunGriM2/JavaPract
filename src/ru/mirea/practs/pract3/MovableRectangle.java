package ru.mirea.practs.pract3;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1,xSpeed, ySpeed);
        bottomRight = new MovablePoint(x1, y2 ,xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "The top left of Rectangle is at ("+topLeft.x+topLeft.y+"). \n" +
                "The bottom right of Rectangle is at ("+bottomRight.x+bottomRight.y+"). \n" +
                "Its speed is ("+topLeft.xSpeed+topLeft.ySpeed+")";
    }

    @Override
    public void moveUp() {
        bottomRight.y += bottomRight.ySpeed;
        topLeft.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        bottomRight.y -= bottomRight.ySpeed;
        topLeft.y -= topLeft.ySpeed;
    }

    @Override
    public void moveLeft() {
        bottomRight.x -= bottomRight.xSpeed;
        topLeft.x -= topLeft.xSpeed;
    }

    @Override
    public void moveRight() {
        bottomRight.x += bottomRight.xSpeed;
        topLeft.x += topLeft.xSpeed;
    }
}
