package javaproject2.week4.day16;

public class ReversePyramid {
    private String SpaceChar = "0";

    public ReversePyramid(String spaceChar) {
        this.SpaceChar = spaceChar;
    }

    public String makeALine(int height, int i) {
        return String.format("%s %s\n", SpaceChar.repeat(i), "*".repeat(2 * (height - i) - 1));
    }

    public static void main(String[] args) {
        ReversePyramid rp = new ReversePyramid(" ");
        int height = 4;

        for (int i = 0; i < height; i++) {
            System.out.printf(rp.makeALine(height, i));
        }
    }
}
