package javaproject2.codeup.question81to90;

import java.util.Scanner;

public class CodeUp88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int three = sc.nextInt();

        for (int i = 1; i <= three; i++) {
            if (i%3 == 0) continue;
            else System.out.printf("%d ", i);
        }
    }
}
