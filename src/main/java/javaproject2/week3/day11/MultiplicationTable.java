package javaproject2.week3.day11;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) System.out.printf("[%d X %d = %2d] ", i, j, i*j);
            System.out.println();
        }
        System.out.println();

        int arr[] = {2, 4, 8, 9}; // for문 서로 바꾸면 가로 <-> 세로 바뀜
        for (int a : arr) {
            for (int i = 2; i <= 9; i++) System.out.printf("[%d X %d = %2d] ", a, i, a * i);
            System.out.println();
        }
    }
}
