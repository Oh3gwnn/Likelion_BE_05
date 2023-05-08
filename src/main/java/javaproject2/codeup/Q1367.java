package javaproject2.codeup;

import java.util.Scanner;

public class Q1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) System.out.printf(" ");
            for (int k = 0; k < n; k++) System.out.printf("*");
            System.out.println();
        }
    }
}
