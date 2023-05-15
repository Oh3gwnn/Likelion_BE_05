package javaproject2.week5.day20;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort02 {
    private Comparator<Integer> comparator;

    public BubbleSort02(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

    private int[] sortARound(int[] arr, int untll) {
        for (int i = 0; i < untll; i++) {
            if(comparator.compare(arr[i], arr[i + 1]) > 0) {
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
        BubbleSort02 bs = new BubbleSort02((o1, o2) -> o2 - o1);
        BubbleSort02 bs2 = new BubbleSort02(Comparator.comparingInt(o -> o));
        BubbleSort02 bs3 = new BubbleSort02(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; //오름차순 o2 - o1 내림차순
            }
        });

        int[] arr = {7, 2, 3 ,9 ,21 ,28, 11, 1};

        System.out.println(Arrays.toString(bs.sort(arr)));
        System.out.println(Arrays.toString(bs2.sort(arr)));
        System.out.println(Arrays.toString(bs3.sort(arr)));
    }
}
