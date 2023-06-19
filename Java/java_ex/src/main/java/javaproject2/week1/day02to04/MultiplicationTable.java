package javaproject2.week1.day02to04;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        // int B = sc.nextInt();

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        // System.out.printf("%d * %d = %d", A, B, A*B);
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", A, i, A*i);
        }
    }
}
