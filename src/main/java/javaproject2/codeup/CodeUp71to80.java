package javaproject2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp71to80 {
    /** Main 클래스 복붙용
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        }
    }
    **/
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 1071 자바에 goto가 있나? 안되는데 모르겠당 1073
        while (true) {
            int a = sc.nextInt();
            if (a == 0) break;
            else System.out.println(a);
        }

        // 1072
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            int c = sc.nextInt();
            System.out.println(c);
        }

        // 1074
        int d = sc.nextInt();
        for (int i = d; i > 0; i--) {
            System.out.println(i);
        }

        // 1075
        int e = sc.nextInt();
        for (int i = e-1; i >= 0; i--) {
            System.out.println(i);
        }

        // 1076
        int alpha = (int)sc.next().charAt(0);
        for (int i = 97; i <= alpha; i++) {
            System.out.println((char)i);
        }

        // 1077
        int f = sc.nextInt();
        for (int i = 0; i <= f; i++) {
            System.out.println(i);
        }

        // 1078
        int even = sc.nextInt();
        int sumeven = 0;
        for (int i = 1; i <= even; i++) {
            if (i % 2 == 0) sumeven += i;
        }
        System.out.println(sumeven);

        // 1079
        while (true) {
            char bet = sc.next().charAt(0);
            System.out.println(bet);
            if (bet == 'q') break;
        }

        // 1080
        int fact = sc.nextInt();
        int i = 1, sumf = 0;
        while (sumf < 1000) {
            if (sumf+i >= fact) {System.out.println(i); break;}
            else sumf += i;
            i++;
        }
    }
}
