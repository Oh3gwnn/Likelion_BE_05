package javaproject2.codeup.question81to90;

import java.util.Scanner;

public class CodeUp89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i!=n) a += d;
            else System.out.printf("%d", a);
        }
    }
}