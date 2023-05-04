package javaproject2.codeup;

import java.util.Scanner;

public class Q4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [9][9];
        int max = 0, xy[] = new int [2];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    xy[0] = i + 1;
                    xy[1] = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", xy[0], xy[1]);
    }
}