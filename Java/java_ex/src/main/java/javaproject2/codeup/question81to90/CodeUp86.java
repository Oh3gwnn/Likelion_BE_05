package javaproject2.codeup.question81to90;

import java.util.Scanner;

public class CodeUp86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextInt(), h = sc.nextInt(), b = sc.nextInt();
        double result = (w*h*b) / 8 / 1024 / 1024;
        System.out.printf("%.2f MB", result);
    }
}
