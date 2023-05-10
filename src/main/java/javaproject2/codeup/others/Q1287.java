package javaproject2.codeup.others;

import java.util.Scanner;

public class Q1287 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < n * i; j++) System.out.printf("*");
            System.out.println();
        }
    }
}