package javaproject2.week4.day15;

import java.util.Scanner;

public class StarStaircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //좌 정렬
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.printf("*");
            System.out.println();
        }
        //우 정렬
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0; j--) System.out.printf(" ");
            for (int j = 1; j <= i; j++) System.out.printf("*");
            System.out.println();
        }
    }
}
