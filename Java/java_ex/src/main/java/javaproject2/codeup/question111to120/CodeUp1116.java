package javaproject2.codeup.question111to120;

import java.util.Scanner;

public class CodeUp1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        System.out.printf("%d+%d=%d\n", n,m,n+m);
        System.out.printf("%d-%d=%d\n", n,m,n-m);
        System.out.printf("%d*%d=%d\n", n,m,n*m);
        System.out.printf("%d/%d=%d\n", n,m,n/m);
    }
}