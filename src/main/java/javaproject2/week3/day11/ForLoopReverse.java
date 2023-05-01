package javaproject2.week3.day11;

public class ForLoopReverse {
    public static void main(String[] args) {
        System.out.println("10 ~ 1 출력 결과:");
        for (int i = 10; i > 0; i--) System.out.printf("%d ", i);
        System.out.println();

        System.out.println("10 ~ 0 출력 결과:");
        for (int i = 10; i >= 0; i--) System.out.printf("%d ", i);
        System.out.println();

        /**무한 루프 오류**/
//        System.out.println("10 ~ 1 출력 결과:");
//        for (int i = 10; i > 0; i++) System.out.printf("%d ", i);
//        System.out.println();

    }
}
