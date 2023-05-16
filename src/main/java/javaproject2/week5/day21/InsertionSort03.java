package javaproject2.week5.day21;

import java.util.Arrays;

public class InsertionSort03<T extends Comparable> {
    private T[] sort(T[] arr, boolean isAscending) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if ((isAscending ? arr[j - 1].compareTo(arr[j]) : arr[j].compareTo(arr[j - 1])) > 0) { // 내림차순
                    T tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else break;
            }
        }
        return arr;
    }

    private T[] sort(T[] arr) { return sort(arr, true); }

    public static void main(String[] args) {
        InsertionSort03<Integer> intIs = new InsertionSort03();
        InsertionSort03<Character> charIs = new InsertionSort03();

        Integer[] arr = {7, 2, 3, 9, 27, 11, 53, 1};
        Character[] carr = {'a', 'x', 'z', 'e', 'b', 'q'};

        System.out.println(Arrays.toString(intIs.sort(arr)));
        System.out.println(Arrays.toString(charIs.sort(carr, true)));
    }
}
