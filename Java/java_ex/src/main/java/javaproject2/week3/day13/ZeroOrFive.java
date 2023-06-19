package javaproject2.week3.day13;

import java.util.Scanner;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        while (num > 0) {
            int remainder = num % 10;
            if(remainder % 5 != 0) return false;
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.printf("%d는 0과 5로 이루어졌습니까?\n%b",num, isZeroOrFive(num));
    }
}
