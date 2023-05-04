package javaproject2.codeup.question91to100;

import java.util.Scanner;

public class CodeUp99 {
    public static void main(String[] args) {
        // 입력 (10*10 미로 구조, 먹이 위치)
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) a[i][j] = sc.nextInt();
        }

        // 개미 현위치(좌표(x, y))
        int x = 1, y = 1;

        while (true) {
            // 편하게 보시라고 배열에 맞게 좌표 넣어드렸습니다.
            // ex) 좌표(x, y) -> a[y][x]

            // 먹이 도착했을 경우
            if (a[y][x] == 2) {
                a[y][x] = 9;
                break;
            }

            // 개미 현 위치 이동했다고 체크
            a[y][x] = 9;

            // 오른쪽(x+1) 벽이 없다? 우측 한 칸 이동
            if (a[y][x + 1] != 1) x += 1;
                // 오른쪽 벽이 있고, 아래(y+1) 벽이 없다? 아래 한 칸 이동
            else if (a[y + 1][x] != 1 && a[y][x + 1] == 1) y += 1;
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