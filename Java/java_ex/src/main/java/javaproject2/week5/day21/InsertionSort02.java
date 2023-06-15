package javaproject2.week5.day21;

import java.util.Arrays;

public class InsertionSort02 {
    private int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if ((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j - 1]) > 0) { // 내림차순
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else break;
            }
        }
        return arr;
    }

    private int[] sort(int[] arr) {
        return sort(arr, true);
    }

    public static void main(String[] args) {
        InsertionSort02 is = new InsertionSort02();
        int[] arr = {7, 2, 3, 9, 27, 11, 53, 1};
        is.sort(arr, false);
        System.out.println(Arrays.toString(arr));
    }
}
