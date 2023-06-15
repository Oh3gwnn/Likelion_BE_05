package javaproject2.codeup.question01to80;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;

public class CodeUp21to30 {
    /* Main 클래스 복붙용
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        }
    }

    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.BufferedReader;

    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

        }
    }
    */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 1021
        String A = sc.next();
        System.out.printf("%s", A);

        // 1022 (메인에 입출력 예외처리 추가. import 입력,버퍼,예외 ㅇㄴ 그냥 새로만들까?)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());

        // 1023
        String[] B = sc.next().split("\\.");
        System.out.printf("%s\n%s", B[0], B[1]);

        // 1024
        String[] Char = sc.next().split("");
        for(String c : Char) {
            System.out.printf("\'%s\'\n", c);
        }

        // 1025
        String[] nums = sc.next().split("");
        int digit = 10000;
        for(String n : nums) {
            System.out.printf("[%s]\n", Integer.parseInt(n) * digit);
            digit /= 10;
        }

        // 1026
        String[] time = sc.next().split(":");
        System.out.printf("%s", Integer.parseInt(time[1]));

        // 1027
        String[] ymd = sc.next().split("\\.");
        int y = Integer.parseInt(ymd[0]);
        int m = Integer.parseInt(ymd[1]);
        int d = Integer.parseInt(ymd[2]);
        System.out.printf("%02d-%02d-%04d", d, m, y);

        // 1028, 1030
        long D = sc.nextLong();
        System.out.printf("%d", D);

        // 1029
        double notF = sc.nextDouble();
        System.out.printf("%.11f", notF);
    }
}
