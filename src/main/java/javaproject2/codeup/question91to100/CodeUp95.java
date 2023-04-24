package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] += sc.nextInt();

        for (int i = n-1; i >= 0; i--) System.out.printf("%d ", a[i]);
    }
}