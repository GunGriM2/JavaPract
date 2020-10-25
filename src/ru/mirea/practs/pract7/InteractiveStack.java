package ru.mirea.practs.pract7;

import java.util.Scanner;

public class InteractiveStack {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int size;

        System.out.println("Введите размер стека");
        size = in.nextInt();
        Stack stack = new Stack(size);

        System.out.println("Ввыберите действие:");
        System.out.println("1. Вставить элемент");
        System.out.println("2. Удалить элемент");
        System.out.println("3. Получить значение элемента");
        System.out.println("4. Вывести все элементы");
        System.out.println("0. Остановить программу");

        int temp = -1;
        while (temp != 0)
        {
            temp=in.nextInt();

            if (temp == 1)
            {
                if (!stack.isFull())
                {
                    System.out.println("Введите значение");
                    int num = in.nextInt();
                    stack.add(num);
                }
            }
            if (temp == 2)
            {
                if (!stack.isEmpty())
                {
                    stack.delete();
                    System.out.println("Элемент удален");
                }
            }
            if (temp == 3)
            {
                if (!stack.isEmpty())
                {
                    System.out.println("Получен элемент " + stack.get());
                }
            }
            if (temp == 4)
            {
                if (!stack.isEmpty())
                {
                    System.out.print("Стек: ");
                    stack.printAll();
                    System.out.println("");
                }
            }
        }

    }
}
