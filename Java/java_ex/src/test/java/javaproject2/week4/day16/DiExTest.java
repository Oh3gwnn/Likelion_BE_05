package javaproject2.week4.day16;

import static org.junit.jupiter.api.Assertions.*;

class DiExTest {
    public static void main(String[] args) {
        ParallelogramShapeDrawer ps = new ParallelogramShapeDrawer();
        DiEx diEx = new DiEx(ps);
        diEx.doSth();
    }
}