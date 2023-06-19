package javaproject2.week4.day16;

import java.util.Scanner;

public class SugarCookie {

    // 0. arr 생성자
    private int[][] arr;

    public SugarCookie(int h, int w) {
        this.arr = new int[h][w];
    }

    // 1. 입력 시작
    public static void StartInput() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        SugarCookie sugars = new SugarCookie(h, w);
        int n = sc.nextInt();

        for (int k = 0; k < n; k++) {
            int l = sc.nextInt(), d = sc.nextInt();
            int x = sc.nextInt() - 1, y = sc.nextInt() - 1;

            sugars.Pullingout(l, d, x, y);
            sugars.PrintSugar();
        }
    }

    // 2. 설탕 뽑기
    public void Pullingout(int l, int d, int x, int y) {
        int i = 0, j = 0;

        if (d==0) while (i < l) {
            arr[x][y+i] = 1;
            i++;
        }
        else if (d==1) while (j < l) {
            arr[x+j][y] = 1;
            j++;
        }
    }

    // 3. 출력
    public void PrintSugar() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) System.out.printf("%d ", arr[i][j]);
            System.out.printf("\n");
        }
        System.out.println("---------");
    }

    // 메인
    public static void main(String[] args) {
        StartInput();
    }
}