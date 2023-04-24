package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int [19][19];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[sc.nextInt()-1][sc.nextInt()-1] = 1; // += 하면 중복 시 1보다 커져서 X
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) System.out.printf("%d ", a[i][j]);
            System.out.printf("\n");
        }
    }
}