package javaproject2.week4.day17;

import java.io.IOException;

// 추상 클래스 상속받는 하위 클래스
public class PyramidShapeDrawer2 extends ShapeDrawer2 {

    // 하위 클래스의 메소드가 상위 클래스의 동일한 메소드를 덮어버림
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }

    public static void main(String[] args) throws IOException {
        PyramidShapeDrawer2 pd2 = new PyramidShapeDrawer2();
        pd2.printShape(5);
        pd2.makeAFile(5, "Pyramid");
    }
}