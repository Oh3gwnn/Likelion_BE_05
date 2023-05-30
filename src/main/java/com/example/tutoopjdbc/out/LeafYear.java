package com.example.tutoopjdbc.out;

public class LeafYear {

    private static boolean isTrueLeafYear(int year) {
        if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) return true;
        else return false;
    }

    public static void addLeafYear(int year) {
        System.out.println(isTrueLeafYear(year) ? year + "년은 윤년입니다." : year + "년은 윤년이 아닙니다.");
    }
}