package javaproject2.week5.day20;

import java.util.Arrays;

public class BubbleSort02 {
    private int[] sortARound(int[] arr, int untll) {
        for (int i = 0; i < untll; i++) {
            if(arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
        }
        return arr;
    }

    private int[] sort(int[] arr){
        for (int j = 1; j <= arr.length; j++) {
            arr = sortARound(arr, arr.length - j);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort02 bs = new BubbleSort02();
        int[] arr = {7, 2, 3 ,9 ,21 ,28, 11, 1};
        bs.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
