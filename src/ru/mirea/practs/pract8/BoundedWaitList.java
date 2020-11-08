package ru.mirea.practs.pract8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {
    int capacity, current;
    public BoundedWaitList(int capacity) {
        this.queue = new ConcurrentLinkedQueue<>();
        this.capacity = capacity;
        this.current = 0;
    }
    public int getCapacity() {
        return this.capacity;
    }
    @Override
    public void add(Object element) {
        if (this.current < this.capacity) {
            this.queue.add((E) element);
            this.current++;
        } else {
            System.out.println("Cant insert");
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "queue=" + queue +
                '}';
    }
}
