package javaproject2.week4.day15;

import static org.junit.jupiter.api.Assertions.*;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft();
        si.moveRight();
        System.out.println(si.location);
    }
}