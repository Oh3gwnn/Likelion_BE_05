package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[23], n = sc.nextInt();
        for (int i = 0; i < n; i++) a[sc.nextInt()-1]+=1;

        for (int i = 0; i < 23; i++) System.out.printf("%d ", a[i]);
    }
}