package ru.mirea.practs.pract12.task1;

public class TestPerson {

    public static void main(String[] args) {
        var p1 = new Person("Grin");
        System.out.println(p1);

        p1.setName("Maksim");
        System.out.println(p1);

        p1.setPatronymic("Vici");
        System.out.println(p1);
    }
}