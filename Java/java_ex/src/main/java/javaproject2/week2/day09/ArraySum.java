package javaproject2.week2.day09;

public class ArraySum {
    public static void main(String[] args) {
        int answer = 0;
        int[] arr = {2, 1, 7, 9};
        for (int i = 0; i < 4; i++) answer += arr[i];
        System.out.printf("answer: %d", answer);
    }
}
