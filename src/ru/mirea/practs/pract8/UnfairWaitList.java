package ru.mirea.practs.pract8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        this.queue = new ConcurrentLinkedQueue<E>();
    }

    public void remove(E element) {
        ConcurrentLinkedQueue<E> tmp = new ConcurrentLinkedQueue<E>();
        for (E el : this.queue) {
            if (el != element) {
                tmp.add(el);
            }
        }
        this.queue = tmp;
    }
    public void moveToBack(E element) {
        ConcurrentLinkedQueue<E> tmp = new ConcurrentLinkedQueue<E>();
        for (E el : this.queue) {
            if (el == element) {
                tmp.add(el);
            }
        }
        for (E el : this.queue) {
            if (el != element) {
                tmp.add(el);
            }
        }
        this.queue = tmp;
    }

}

