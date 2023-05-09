package javaproject2.week4.day16;

// 추상 클래스
public abstract class ShapeDrawer {
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf(makeALine(height, i));
        }
    }
    // 추상 메소드
    public abstract String makeALine(int h, int i);
}
