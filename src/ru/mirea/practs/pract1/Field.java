package ru.mirea.practs.pract1;

public class Field {
    public static void main(String[] args) {
        Ball ball1 = new Ball("blue", 10);
        Ball ball2 = new Ball("yellow", 13);
        Ball ball3 = new Ball("white");
        ball3.setRadius(17);
        System.out.println(ball1);
        ball1.intoVolume();
        ball2.intoVolume();
        ball3.intoVolume();
    }
}
