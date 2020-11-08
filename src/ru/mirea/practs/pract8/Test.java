package ru.mirea.practs.pract8;

public class Test {
    public static void main(String[] args) {
        UnfairWaitList<Element> waitList = new UnfairWaitList<>();
        Element element1 = new Element("element of surprise", 100);
        Element element2 = new Element("element of water", 10);
        Element element3 = new Element("element of fire", 15);
        Element element4 = new Element("element creature", 25);
        waitList.add(element1);
        waitList.add(element2);
        waitList.add(element3);
        waitList.add(element4);
        waitList.remove(element3);
        waitList.moveToBack(element4);
        System.out.println(waitList.toString());

        BoundedWaitList<Element> p = new BoundedWaitList<>(4);
        p.add(element1);
        p.add(element2);
        p.add(element3);
        p.add(element4);
        p.add(element3);
    }
}
