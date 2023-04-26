package javaproject2.week2.day08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};
        System.out.println("변경 전: " + Arrays.toString(arr));

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("변경 후: " + Arrays.toString(arr));
    }
}
