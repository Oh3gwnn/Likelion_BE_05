package javaproject2.codeup.others;

import java.util.Scanner;

public class Q1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;

        while (n != 0) {
            digit += 1;
            n /= 10;
        }
        System.out.println(digit);
    }
}