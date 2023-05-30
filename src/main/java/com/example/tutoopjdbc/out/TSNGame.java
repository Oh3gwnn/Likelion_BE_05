package com.example.tutoopjdbc.out;

public class TSNGame {
    private static String clapCount(int i) {
        if (((i%10)%3 == 0) && ((i%10) != 0)) return "*";
        else if (((i/10)%3 == 0) && ((i/10) != 0)) return "*";
        else return "";
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) System.out.printf("%02d%s\n", i, clapCount(i));
    }
}
