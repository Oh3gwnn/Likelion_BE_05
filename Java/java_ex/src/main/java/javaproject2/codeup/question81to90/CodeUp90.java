package javaproject2.codeup.question81to90;

import java.util.Scanner;

public class CodeUp90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), r = sc.nextInt(), n = sc.nextInt();
        // int 형은 10^3 처리를 못함
        for (int i = 1; i <= 10; i++) {
            if (i!=n) a *= r;
            else System.out.printf("%d", a);
        }
    }
}