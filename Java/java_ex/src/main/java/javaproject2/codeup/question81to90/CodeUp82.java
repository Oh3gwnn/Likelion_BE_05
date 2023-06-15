package javaproject2.codeup.question81to90;

import java.util.Scanner;

public class CodeUp82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Hex = sc.nextInt(16);
        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", Hex, i, Hex * i);
        }
    }
}