package ru.mirea.practs.pract2;

public class TestAuthor {
    public static void main(String[] args) {
        Author Author1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'M');
        Author Author2 = new Author("Anna Ivanova", "wrongemail@somewhere.com", 'F');
        Author2.setEmail("anIvanova@somewhere.com");
        System.out.println(Author1);
        System.out.println(Author2);

    }
}
