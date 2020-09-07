package ru.mirea.pract1;
import java.lang.*;

public class Pitomnik {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Meow", 2);
        Dog dog2 = new Dog("Palma", 7);
        Dog dog3 = new Dog("Bobik");
        dog3.setAge(4);
        System.out.println(dog1);
        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();
    }
}
