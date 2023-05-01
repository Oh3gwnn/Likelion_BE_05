package javaproject2.week3.day11;

public class ForLoopForward {
    public static void main(String[] args) {
        int n = 1;
        // 1~100 출력
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++, n++) System.out.printf("%2d ", n);
            System.out.println();
        }
    }
}
