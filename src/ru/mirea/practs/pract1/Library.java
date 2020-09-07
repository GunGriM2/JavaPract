package ru.mirea.practs.pract1;

public class Library {
    public static void main(String[] args) {
        Book Book1 = new Book("Physics", 300);
        Book Book2 = new Book("Clockwerk Orange", 400);
        Book Book3 = new Book("Standart");
        Book3.setPages(250);
        System.out.println(Book1);
        Book1.intoTime();
        Book2.intoTime();
        Book3.intoTime();
    }
}
