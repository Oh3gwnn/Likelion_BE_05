package javaproject2.week2.day09;

public class OrNotEx {
    public static void main(String[] args) {
        // Or: ||
        int yearsOfExp = 8; // 8년차
        int numOfProj = 12; // 프로젝트 12개
        boolean isPromotion = yearsOfExp > 5 || numOfProj > 10; // 6년차 이상, Proj 11개 이상
        System.out.printf("팀장 승진 여부: %b\n", isPromotion);

        // Not: !
        boolean result = !true;
        System.out.printf("%b\n", result);
        result = !false;
        System.out.printf("%b\n", result);
    }
}
