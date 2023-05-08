package javaproject2.programmers;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) System.out.println("*".repeat(i));
    }
}

// 파이썬
// [print('*'*(i+1)) for i in range(int(input()))]


