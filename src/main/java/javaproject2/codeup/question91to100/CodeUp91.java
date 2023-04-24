package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp91 { // range() 없냐구!! 젠장!!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int m = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            a = a*m + d;
        }
        System.out.printf("%d", a);
    }
}