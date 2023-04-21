package javaproject2.week1;

public class SpaceInvadersMemberVariable {
    int location;

    public void moveLeft() {
        location -= 1;
        System.out.printf("moveLeft: %d\n", location);
    }
    public void moveLight() {
        location += 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveLeft();
        simv.moveLight();
        simv.moveLight();
    }
}
