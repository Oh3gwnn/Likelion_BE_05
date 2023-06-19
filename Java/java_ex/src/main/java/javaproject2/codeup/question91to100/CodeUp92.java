package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), day = 1;
        while (day%a!=0 || day%b!=0 || day%c!=0) day++;
        System.out.printf("%d", day);
    }
}