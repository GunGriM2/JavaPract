package ru.mirea.practs.pract8;

public class Element {
    public String name;
    public int value;
    Element(String name, int value) {
        this.name = name;
        this.value = value;

    }

    @Override
    public String toString() {
        return name + " " + value;
    }
}
