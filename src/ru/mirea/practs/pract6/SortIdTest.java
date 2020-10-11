package ru.mirea.practs.pract6;

import java.util.Random;

public class SortIdTest {

    static class Student{

        private int iDNumber;

        Student(int iDNumber){
            this.iDNumber = iDNumber;
        }

        public int getId(){
            return iDNumber;
        }

        public void setId(int iDNumber){
            this.iDNumber = iDNumber;
        }
    }

    public static void main(String[] args) {

        int N = 20;
        Student[] students = new Student[N];
        Random random = new Random();

        for (int i = 0; i < N; i++)
            students[i] = new Student(random.nextInt(100));


        for (int i = 0; i < N; i++)
            System.out.print(students[i].getId() + " ");


        for (int i = 1; i < N; i++) {
            int key = students[i].getId();
            int j = i - 1;
            while (j>=0 && students[j].getId() > key){
                students[j + 1].setId(students[j].getId());
                j--;
            }
            students[j + 1].setId(key);
        }

        System.out.println();

        for (int i = 0; i < N; i++)
            System.out.print(students[i].iDNumber + " ");

    }

}
