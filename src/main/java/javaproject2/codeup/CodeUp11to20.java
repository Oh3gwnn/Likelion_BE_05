package javaproject2.codeup;

import java.util.Scanner;

public class CodeUp11to20 {
    /* Main 클래스 복붙용
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        }
    }
    */
    public static void main(String[] args) {
        // import Scanner랑 Scanner 호출 챙기기
        Scanner sc = new Scanner(System.in);

        // 1011
        char A = sc.next().charAt(0);
        System.out.printf("%c", A);

        // 1012
        float B = sc.nextFloat();
        System.out.printf("%f", B);

        // 1013
        int C = sc.nextInt();
        int D = sc.nextInt();
        System.out.printf("%d %d", C, D);

        // 1014
        String E = sc.next();
        String F = sc.next();
        System.out.printf("%s %s", F, E);

        // 1015
        float G = sc.nextFloat();
        System.out.printf("%.2f", G);

        // 1017
        int K = sc.nextInt();
        System.out.printf("%d %d %d", K, K, K);

        // 1018
        String[] time = sc.next().split(":");
        System.out.printf("%s:%s", time[0], time[1]);

        // 1019
        String[] ymd = sc.next().split("\\.");
        int y = Integer.parseInt(ymd[0]);
        int m = Integer.parseInt(ymd[1]);
        int d = Integer.parseInt(ymd[2]);
        System.out.printf("%04d.%02d.%02d", y, m, d);

        // 1020
        String mj = sc.next();
        mj = mj.replace("-", "");
        System.out.printf("%s", mj);
    }
}
