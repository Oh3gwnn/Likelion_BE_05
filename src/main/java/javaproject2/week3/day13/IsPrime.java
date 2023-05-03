package javaproject2.week3.day13;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 소수 찾는 과정 출력
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            System.out.printf("[%d %% %d = %d]\n", num, i, num % i);
        }
        System.out.println("");

        // 2. 소수 판별
        int factors = 0;
        for (int i = 2; i < num; i++) if(num % i == 0) factors++;
        System.out.println("factors: " + factors);
        System.out.println(num + " --> Prime?: " + (factors == 0));
        System.out.println("");

        // 3. 1/2 처리
        for (int i = 2; i <= num/2; i++) {
            System.out.printf("[%d %% %d = %d]\n", num, i, num % i);
        }
        System.out.println("");

        // 4. 루트 처리
        for (int i = 2; i <= Math.sqrt(num); i++) {
            System.out.printf("[%d %% %d = %d]\n", num, i, num % i);
        }
        System.out.println("");

        // 5. 소수 찾기 break 적용
        factors = 0;
        for (int i = 2; i < num; i++) if(num % i == 0) {
            factors++;
            break;
        }
        System.out.println("factors: " + factors);
        System.out.println(num + " --> Prime?: " + (factors == 0));
    }
}
