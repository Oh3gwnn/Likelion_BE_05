package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) a[i][j] = sc.nextInt();
        }

        int x = 1, y = 1;

        while (true) {

            // 먹이 도착했을 경우
            if (a[y][x] == 2) {
                a[y][x] = 9;
                break;
            }

            // 개미 현 위치
            a[y][x] = 9;

            // 우측 확인
            if (a[y][x + 1] != 1) {
                x++;
                continue;
            }

            // 하측 확인
            if (a[y + 1][x] != 1) {
                y++;
                continue;
            }
            // 둘 다 벽있을 경우 종료
            break;
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