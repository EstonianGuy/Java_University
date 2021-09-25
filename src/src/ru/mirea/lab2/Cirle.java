package ru.mirea.lab2;

public class Cirle {
    private double radius;
    final  double PI = 3.14;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double Square(){
        return (PI * radius * radius);
    }
    public double Perimeter() {
        return (2 * PI * radius);
    }
    public  String toString(){
        return "Your Square is "+Perimeter()+" Your Square is "+Square()+"";
    }


}
