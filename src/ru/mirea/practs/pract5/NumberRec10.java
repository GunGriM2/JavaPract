package ru.mirea.practs.pract5;

public class NumberRec10 {
    static int recursion(int n, int d){
        if (n == 0)
            return d;

        return recursion(n/10, d*10 + n%10);
    }
    public static void main(String[] args) {
        System.out.println(recursion(123463421, 0)); // вызов рекурсивной функции
    }
}

