package javaproject2.week3.day11;

public class ForLoopForward {
    public static void main(String[] args) {
        // 0~9 출력
        System.out.println("0~9 출력 결과:");
        for (int i = 0; i < 10; i++) System.out.printf("%d ", i);
        System.out.println("\n");


        // 1~100 출력
        int n = 1;
        System.out.println("1~100 출력 결과:");

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++, n++) System.out.printf("%2d ", n);
            System.out.println();
        }
    }
}
