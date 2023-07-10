package javaproject2.week2.day10;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp = sc.nextInt();
        int pje = sc.nextInt();

        if (exp > 5 || pje > 10) System.out.println("팀장 승진 대상입니다.");
        else System.out.println("팀장 승진 대상이 아닙니다.");
    }
}
