package javaproject2.week6.day28;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    final double PI = 3.14159;

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculatePerimeter() {
        return PI * 2 * radius;
    }
}
