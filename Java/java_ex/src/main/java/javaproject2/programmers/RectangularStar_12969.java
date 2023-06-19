package javaproject2.programmers;

import java.util.Scanner;

public class RectangularStar_12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = 0; i < b; i++) System.out.println("*".repeat(a));
    }
}

/** 파이썬 풀이
 * a, b = map(int, input().strip().split(' '))
 * [print("*"*a) for _ in range(b)]
 * **/
