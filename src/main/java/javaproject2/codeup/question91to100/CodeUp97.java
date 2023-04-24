package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int [19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) a[i][j] = sc.nextInt();
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int garo = sc.nextInt(), sero = sc.nextInt();
            for (int j = 0; j < 19; j++) {
                a[garo-1][j] = a[garo-1][j] == 0 ? 1 : 0;
            }
            for (int j = 0; j < 19; j++) {
                a[j][sero-1] = a[j][sero-1] == 0 ? 1 : 0;
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) System.out.printf("%d ", a[i][j]);
            System.out.printf("\n");
        }
    }
}