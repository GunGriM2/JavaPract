package ru.mirea.practs.pract8;


import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList {
    ConcurrentLinkedQueue<E> queue;
    public WaitList() {
        this.queue = new ConcurrentLinkedQueue<E>();
    }

    public WaitList(Collection<E> c) {
        this.queue = (ConcurrentLinkedQueue<E>) c;
    }

    @Override
    public String toString() {
        for (E el : this.queue) {
                System.out.println(el.toString());
        }
        return "";
    }

    @Override
    public void add(Object element) {
        queue.add((E) element);
    }

    @Override
    public E remove() {
        return this.queue.peek();
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
}
