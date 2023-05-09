package javaproject2.week4.day16;

import java.util.Scanner;

public class MakeChoiceShape {

    // 0. SpaceChar, SpaceChar 생성자
    private String SpaceChar = "0";

    public MakeChoiceShape(String spaceChar) {
        this.SpaceChar = spaceChar;
    }

    // 1. 시작
    public static void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("(평행사변형: 0, 역피라미드:1)\n만들 모양 숫자를 입력해주세요 : ");
        int choice = sc.nextInt();
        System.out.printf("길이를 입력해주세요 : ");
        int height = sc.nextInt();
    }

    // 2. 모양 만들기
    public static void MakeShape(int height, int choice) {
        MakeChoiceShape rp = new MakeChoiceShape(" ");

        for (int i = 0; i < height; i++) {
            System.out.printf(rp.makeALine(height, i, choice));
        }
    }

    // 3. 한 줄 생성
    public String makeALine(int height, int i, int choice) {
        return String.format("%s %s\n", SpaceChar.repeat(i), ChoiceShape(height, i, choice));
    }

    // 4. choice 따라 평행사변형, 역피라미드 나누기
    public String ChoiceShape(int height, int i, int choice) {
        if (choice == 1) return "*".repeat(2 * (height - i) - 1);
        else if (choice == 0) return "*".repeat(height);
        else return "";
    }

    // 메인
    public static void main(String[] args) {
        Start();
    }
}