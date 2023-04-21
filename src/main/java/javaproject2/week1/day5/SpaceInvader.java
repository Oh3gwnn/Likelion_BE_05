package javaproject2.week1.day5;

public class SpaceInvader {
    static int location;
    private void moveLeft() {
        int location = 0;
        location = -1;
    }
    private void moveRight() {
        int location = 0;
        location = 1;
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.moveLeft();
        si.moveRight();
    }
}

