package javaproject2.codeup.question81to90;

import java.util.Scanner;

public class CodeUp85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), s = sc.nextInt();
        double result = (h*b*c*s) / 8 / 1024 / 1024;
        System.out.printf("%.1f MB", result);
    }
}
