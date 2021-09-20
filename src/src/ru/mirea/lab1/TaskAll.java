package ru.mirea.lab1;
import java.util.Scanner;
import java.util.Arrays;

public class TaskAll{
    private int[] numbers;
    private int output;

    public TaskAll(){
    }


    public void filler(int[] numbers) {
        this.numbers = numbers;
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }

    public int[] getNum(){
        return numbers;
    }
    /*public void summWhile() {
        output = 0;
        int i = 0;
        while (i < 10) {
            output = output + numbers[i];
            i++;
        }
    }

    public void summFor() {
        output = 0;
        for (int i = 0; i < 10; i++) {
            output = output + numbers[i];
        }
    }

    public void summDoWhile() {
        output = 0;
        int i = 0;
        do {
            output = output + numbers[i];
            i++;
        } while (i < 10);
    }*/

    public String toString() {
        return "Summ = " + numbers;
    }
}