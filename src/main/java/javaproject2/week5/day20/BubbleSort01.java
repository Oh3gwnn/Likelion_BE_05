package javaproject2.week5.day20;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 21, 28, 11, 1};

        for (int i = 1; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

//        tmp = arr[1];
//        arr[1] = arr[2];
//        arr[2] = tmp;
//        System.out.println(Arrays.toString(arr));
//
//        tmp = arr[2];
//        arr[2] = arr[3];
//        arr[3] = tmp;
//        System.out.println(Arrays.toString(arr));
    }
}
