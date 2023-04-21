package javaproject2.week1.day5;

import java.awt.*;


public class PointTest {

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x:%d, y:%d\n", p1.x, p1.y);
        System.out.printf("xy가 같은지? %s\n", p1.isSameXy());

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("x:%d, y:%d\n", p2.x, p2.y);
        System.out.printf("xy가 같은지? %s\n", p2.isSameXy());

        Point p3 = new Point();
        p3.x = 3;
        p3.y = 2;
        System.out.printf("x:%d, y:%d\n", p3.x, p3.y);
        System.out.printf("xy가 같은지? %s\n", p3.isSameXy());
    }
}
