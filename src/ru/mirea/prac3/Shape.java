package ru.mirea.prac3;

public class Shape {
    private String color;
    private boolean filled;
    public Shape(){
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


    public double getArea(){
        return 0;
    }

    public double getPerimetr(){
        return 0;
    }

    public String toString(){
        return "";
    }
}
