package javaproject2.week4.day16;

// 추상 클래스 상속받는 하위 클래스
public class ParallelogramShapeDrawer extends ShapeDrawer{

    // 하위 클래스의 메소드가 상위 클래스의 동일한 메소드를 덮어버림
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(h));
    }
}