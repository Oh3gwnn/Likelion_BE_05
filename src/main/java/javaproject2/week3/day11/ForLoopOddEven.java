package javaproject2.week3.day11;

public class ForLoopOddEven {
    public static void main(String[] args) {
        System.out.println("1~9 사이의 홀수 출력 결과:");
        for (int i = 1; i < 10; i++) if (i%2==1) System.out.printf("%d ", i);
        System.out.println();

        System.out.println("1~9 사이의 짝수 출력 결과:");
        for (int i = 1; i < 10; i++) if (i%2==0) System.out.printf("%d ", i);
        System.out.println();
    }
}
