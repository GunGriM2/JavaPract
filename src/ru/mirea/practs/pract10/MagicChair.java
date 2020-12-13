package ru.mirea.practs.pract10;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Вызван метод doMagic");
    }

    @Override
    public String toString() {
        return "Магический стул";
    }
}
