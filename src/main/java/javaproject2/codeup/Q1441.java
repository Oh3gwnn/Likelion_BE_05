package javaproject2.codeup;

import java.util.Scanner;

public class Q1441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] bubble = new int[n];
        for (int i = 0; i < n; i++) bubble[i] = sc.nextInt();

        // 버블 정렬 n만큼 해줘야되는거구나.. 한번돌리는줄 ㅋㅋ;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n-1; i++) {
                if (bubble[i] > bubble[i+1]) {
                    int temp = bubble[i];
                    bubble[i] = bubble[i+1];
                    bubble[i+1] = temp;
                }
            }
        }
        for (int j = 0; j < n; j++) System.out.println(bubble[j]);
    }
}
