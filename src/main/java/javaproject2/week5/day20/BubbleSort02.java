package javaproject2.week5.day20;

import java.util.Arrays;

public class BubbleSort02 {
    private int[] BubbleSort(int[] arr, int i) {
        for (int j = 0; j < arr.length - i; j++) {
            if(arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort02 bs = new BubbleSort02();
        int[] arr = {7, 2, 3 ,9 ,21 ,28, 11, 1};
        for (int i = 1; i < arr.length; i++) bs.BubbleSort(arr, i);

        System.out.println(Arrays.toString(arr));
    }
}
