package ru.mirea.practs.pract2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        Ball b2 = new Ball(23, 34);
        Ball b3 = new Ball();
        System.out.println(b1);
        System.out.println(b2);
        b3.setXY(12, -10);
        b1.move(30, 15);
        System.out.println(b1);
        System.out.println(b3);
    }
}
