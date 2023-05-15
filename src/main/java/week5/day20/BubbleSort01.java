package week5.day20;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 3 ,9 ,21 ,28, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
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
