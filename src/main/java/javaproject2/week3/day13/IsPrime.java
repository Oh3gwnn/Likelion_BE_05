package javaproject2.week3.day13;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            System.out.printf("%d %% %d = %d\n", num, i, num % i);
        }

        int factors = 0;
        for (int i = 2; i < num; i++) if(num % i == 0) factors++;
        System.out.println("factors: " + factors);
        System.out.println(num + " --> Prime?: " + (factors == 0));
    }
}
