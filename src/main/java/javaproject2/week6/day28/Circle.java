package javaproject2.week6.day28;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    final double pi = 3.14;

    public double calculateArea() {
        return pi * radius * radius;
    }

    public double calculatePerimeter() {
        return pi * 2 * radius;
    }
}
