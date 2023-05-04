package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n], compare = n;
        for (int i = 0; i < n; i++) arr[i] += sc.nextInt();
        for (int i = n-1; i >= 0; i--) compare = compare < arr[i] ? compare : arr[i];
        System.out.println(compare);
    }
}