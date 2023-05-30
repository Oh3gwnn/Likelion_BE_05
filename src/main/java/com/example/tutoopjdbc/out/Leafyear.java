package com.example.tutoopjdbc.out;

import java.util.Scanner;

public class Leafyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println((year%4 == 0) && (year%100 != 0) || (year%400 == 0)? year + "년은 윤년입니다." : year + "년은 윤년이 아닙니다.");
    }
}
