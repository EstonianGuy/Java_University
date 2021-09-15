package ru.mirea.prac3;

import java.lang.Override;
import java.lang.annotation.Target;

public class Square extends Rectangle {
    protected double side;

    public Square() {
        this.filled = false;
        this.color = "red";
    }

    public Square(double side) {
        this.filled = false;
        this.color = "red";
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }


    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.side + "color" + this.color + "";
    }
}
