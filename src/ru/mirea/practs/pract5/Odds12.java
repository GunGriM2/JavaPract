package ru.mirea.practs.pract5;
import java.util.Scanner;

public class Odds12 {
    static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                recursion();
            } else
                recursion();
        }
    }

    public static void main(String[] args) {
        recursion();
}
}