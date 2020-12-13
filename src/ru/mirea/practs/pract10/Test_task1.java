package ru.mirea.practs.pract10;

public class Test_task1 {
    public static void main(String[] args) {
        ConcreteFactory cf = new ConcreteFactory();
        cf.createComplex();
        cf.CreateComplex(-10, 42);
        System.out.println(cf.toString());
    }
}
