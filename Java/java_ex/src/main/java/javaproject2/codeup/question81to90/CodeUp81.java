package javaproject2.codeup.question81to90;

import java.util.Scanner;

public class CodeUp81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt(), dice2 = sc.nextInt();
        for (int i = 1; i <= dice1; i++) {
            for (int j = 1; j <= dice2; j++) System.out.printf("%d %d\n", i, j);
        }
    }
}