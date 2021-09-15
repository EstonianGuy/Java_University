package ru.mirea.prac3;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
    }

    public static void main(String[] args) {

    }
    public Shape(String color){

    }
    public Shape(String color, boolean filled){

    }

    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }


    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Shape {" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
