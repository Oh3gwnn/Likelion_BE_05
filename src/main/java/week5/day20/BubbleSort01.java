package week5.day20;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3 ,9 ,21 ,28, 11, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
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
