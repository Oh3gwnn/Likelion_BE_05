package javaproject2.week6.day28;

public class Rectangle implements Shape{
    private double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return w * h;
    }

    @Override
    public double calculatePerimeter() {
        return w * h * 2;
    }
}
