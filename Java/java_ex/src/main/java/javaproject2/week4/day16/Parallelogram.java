package javaproject2.week4.day16;

public class Parallelogram {
    private String SpaceChar = "0";

    public Parallelogram(String spaceChar) {
        this.SpaceChar = spaceChar;
    }

    public String makeALine(int height, int i) {
        return String.format("%s%s\n", SpaceChar.repeat(i), "*".repeat(height));
    }

    public static void main(String[] args) {
        Parallelogram rp = new Parallelogram(" ");
        int height = 4;

        for (int i = height; i > 0; i--) {
            System.out.printf(rp.makeALine(height, i));
        }
    }
}
