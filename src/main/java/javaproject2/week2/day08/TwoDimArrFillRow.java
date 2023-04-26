package javaproject2.week2.day08;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[2] = new int[] {1, 1, 1, 1, 1};
        printArray(arr);
    }
}