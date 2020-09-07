package ru.mirea.practs.pract1;

public class Book {

    private String name;
    private int pages;

    public Book(String c, int r){
        name = c;
        pages = r;
    }

    public Book(String c){
        name = c;
        pages = 150;
    }

    public Book(){
        name = "Mathematics";
        pages = 150;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String toString(){
        return "name "+this.name+", pages "+this.pages;
    }

    public void intoTime(){
        System.out.println("The "+this.name+" book's average time to read is "+this.pages/2+" minutes");
    }
}
