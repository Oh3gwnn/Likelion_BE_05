package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [19][19];
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) arr[sc.nextInt()-1][sc.nextInt()-1] = 1;

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) System.out.printf("%d ", arr[i][j]);
            System.out.printf("\n");
        }
    }
}