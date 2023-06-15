package javaproject2.codeup.question81to90;

import java.util.Scanner;

public class CodeUp83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1083 아이런 1~9입력 지금봤네 ㅡㅡ
        int tsn = sc.nextInt();
        for (int i = 1; i <= tsn; i++) {
            if (i%3 == 0) System.out.printf("X ");
            else System.out.printf("%d ", i);
        }
        // 아래는 59까진 잘나옴
        // if (((i % 10) % 3 == 0 && i % 10 != 0) || (int) (i / 10) == 3) System.out.printf("X ");
    }
}