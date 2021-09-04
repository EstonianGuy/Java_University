package ru.mireea.prac;

import java.lang.*;
import java.util.Scanner;

public class Book {
    private String name_book;
    private int price_book;

    public Book(String first_n, int first_a) {
        name_book = first_n;
        price_book = first_a;
    }

    public Book(String second_n) {
        name_book = second_n;
        price_book = 345;
    }

    public void setName(String name) {
        this.name_book = name;


    }

    public void setPrice(int price_book) {
        this.price_book = price_book;
    }

    public String getName() {
        return name_book;
    }

    public int getPrice(int price_book) {
        return price_book;
    }

}
