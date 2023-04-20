package javaproject2.week1;

import java.util.Scanner;

public class ScannerEX2 {
    public void inputTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요. 입력 후 Enter, 입력 후 Enter");
        System.out.print("첫번째 숫자: ");
        System.out.println("첫번째 숫자는 " + sc.nextInt() + "입니다.");
        System.out.print("두번째 숫자: ");
        System.out.println("두번째 숫자는 " + sc.nextInt() + "입니다.");
    }
}
