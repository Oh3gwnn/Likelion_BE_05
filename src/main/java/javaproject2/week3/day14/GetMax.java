package javaproject2.week3.day14;

import java.util.Scanner;

public class GetMax {
    public static void main(String[] args) {
        // 최댓값 구하기
        int[] arr = {2, 1, 31, 9, 7};
        int targetValue = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(targetValue < arr[i]) {
                targetValue = arr[i];
            }
        }
        System.out.println(targetValue);

        // 2X2 배열 최댓값
        Scanner sc = new Scanner(System.in);
        int arr2[][] = {{1, 2}, {3, 4}};
        int max = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (max < arr2[i][j]) max = arr2[i][j];
            }
        } System.out.println(max);
    }
}
