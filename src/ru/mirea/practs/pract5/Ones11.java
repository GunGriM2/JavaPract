package ru.mirea.practs.pract5;
import java.util.Scanner;

public class Ones11 {
    static int recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            int k = in.nextInt();
            if (k == 0)
                return 0;
            else if (k == 1)
                return k + recursion();
            else
                return recursion();
        } else if (n == 1)
            return n + recursion();
          else
            return recursion();
    }

    public static void main(String[] args) {
        System.out.println(recursion()); // вызов рекурсивной функции
}
}