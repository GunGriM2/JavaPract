package ru.mirea.practs.pract7;

public class Queue {
    int size, i = -1;
    int queue[];

    Queue(int size)
    {
        this.size = size;
        queue=new int[size];
        for (int j = 0; j < size; j++)
            queue[i] = -1;
    }

    public void add(int num)
    {
        i++;
        if (i >= size)
        {
            System.out.print("Queue overflow");
            return;
        }
        queue[i]=num;
    }

    public void delete()
    {
        if (i == -1)
        {
            System.out.print("Queue underflow");
            return;
        }
        for (int j = 0; j < i; j++)
        {
            queue[j] = queue[j+1];
        }
        queue[i] = -1;
        i--;
    }

    public int get()
    {
        if (i == -1)
        {
            System.out.print("Queue underflow");
            return -1;
        }
        return queue[0];
    }
}
