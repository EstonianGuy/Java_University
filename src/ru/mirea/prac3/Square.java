package ru.mirea.prac3;

public class Square extends Shape {
    protected double side;
    public Square(){
        this.filled = false;
        this.color = "red";
    }
    public Square(double side) {
        this.filled = false;
        this.color = "red";
    }
    public Square(double side,  String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }


    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return  side;


    @Override
    public double getArea(){
        return a*a;
    }

    @Override
    public double getPerimetr(){
        return (a+a) * 2;
    }

    @Override
    public  String toString(){
                return "Shape: square, side: "+this.side+"color"+this.color+"";
    }
}
