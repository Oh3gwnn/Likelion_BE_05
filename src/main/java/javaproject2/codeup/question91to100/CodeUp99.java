package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp99 {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) a[i][j] = sc.nextInt();
        }
        // 개미 현위치
        int x = 1, y = 1;

        while (true) {
            // 먹이 도착했을 경우
            if (a[x][y] == 2) {
                a[x][y] = 9;
                break;
            }

            // 현재 자리 체크
            a[x][y] = 9;

            // 오른쪽 벽 확인 후 아래 벽 확인
            if (a[x][y + 1] != 1) y += 1;
            // 아래 벽은 오른쪽이 막혀있을 때만
            else if (a[x + 1][y] != 1 && a[x][y + 1] == 1) x += 1;
            // 둘 다 막혔으면 끗
            else break;
        }

        // 출력
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.printf("\n");
        }
    }
}

/** 1100번 문제는 없어서 1101 하나 넣어드렸읍니다 :)
import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
 **/