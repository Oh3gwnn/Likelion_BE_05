package javaproject2.week4.day15;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.printf(" ");
            for (int j = 1; j <= (i * 2) - 1; j++) System.out.printf("*");
            System.out.println();
        }
    }
}
