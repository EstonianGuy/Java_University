package ru.mireea.prac;

import java.lang.*;

public class TestBook {
    public static void main(String args[]) {
        Book b1 = new Book("Harry Potter", 345);
        Book b2 = new Book("Martin Eden");
        System.out.println(b1.getName());
    }
}
