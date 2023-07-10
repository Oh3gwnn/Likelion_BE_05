package javaproject2.week5.day20;

import java.util.Arrays;

public class BubbleSort03 {

    private int[] sort(int[] arr, int select) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                switch (select) {
                    case 0 -> {     // 0 -> 오름차순
                        if (arr[i] > arr[j]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                    case 1 -> {     // 1 -> 내림차순
                        if (arr[i] < arr[j]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort03 bs = new BubbleSort03();
        int[] arr = {7, 2, 3, 9, 21, 28, 11, 1};

        System.out.println(Arrays.toString(bs.sort(arr, 0)));
        System.out.println(Arrays.toString(bs.sort(arr, 1)));
    }
}
