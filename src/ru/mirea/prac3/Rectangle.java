package ru.mirea.prac3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.filled = false;
        this.color = "red";
    }
    public Rectangle(double width, double lentgh) {
        this.filled = false;
        this.color = "red";
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length =length;
        this.color = color;
        this.filled = filled;
    }


    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }


    public double getWidth(){
        return  width;
    }
    public double getLength(){
        return length;
    }

    @Override
    public double getArea(){
        return a*b;
    }

    @Override
    public double getPerimetr(){
        return (a + b) * 2;
    }


    public  String toString(){
        return "Shape: rectangle, width, length: "+this.length+","+this.width+",color: "+this.color;
    }



}
