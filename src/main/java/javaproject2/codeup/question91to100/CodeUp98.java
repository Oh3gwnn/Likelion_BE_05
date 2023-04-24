package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(), a[][] = new int [h][w];
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int l = sc.nextInt(), d = sc.nextInt();
            int x = sc.nextInt()-1, y = sc.nextInt()-1;
            int i = 0, j = 0;

            if (d==0) while (i < l) {
                a[x][y+i] = 1;
                i++;
            }
            else if (d==1) while (j < l) {
                a[x+j][y] = 1;
                j++;
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) System.out.printf("%d ", a[i][j]);
            System.out.printf("\n");
        }
    }
}