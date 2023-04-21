package javaproject2.codeup.question01to80;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp41to50 {
    /* Main 클래스 복붙용
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        }
    }
    */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 1041
        char ch = (char)((int)sc.next().charAt(0) + 1);
        System.out.println(ch);

        // 1042
        long ln1 = sc.nextLong();
        long ln2 = sc.nextLong();
        System.out.printf("%d",ln1 / ln2);

        // 1043
        long ln3 = sc.nextLong();
        long ln4 = sc.nextLong();
        System.out.printf("%d",ln3 % ln4);

        // 1044
        long ln5 = sc.nextLong();
        System.out.printf("%d",++ln5);

        // 1045
        long autoln1 = sc.nextLong();
        long autoln2 = sc.nextLong();
        System.out.printf("%d\n", autoln1 + autoln2);
        System.out.printf("%d\n", autoln1 - autoln2);
        System.out.printf("%d\n", autoln1 * autoln2);
        System.out.printf("%d\n", autoln1 / autoln2);
        System.out.printf("%d\n", autoln1 % autoln2);
        System.out.printf("%.2f", (float)autoln1 / (float)autoln2);

        // 1046
        long sn1 = sc.nextLong(), sn2 = sc.nextLong(), sn3 = sc.nextLong();
        System.out.printf("%d\n", sn1 + sn2 + sn3);
        System.out.printf("%.1f\n", (float)(sn1 + sn2 + sn3)/3);

        // 1047
        long shiftnum = sc.nextLong()<<1;
        System.out.println(shiftnum);

        // 1048
        long sftnum1 = sc.nextLong(), sftnum2 = sc.nextLong();
        System.out.println(sftnum1<<sftnum2);

        // 1049 자바는 true/false랑 1/0이랑 다르다.(첨 앎ㄷㄷ 내 수준;;)
        long compare1 = sc.nextLong(), compare2 = sc.nextLong();
        int i1 = compare1>compare2 ? 1 : 0;
        System.out.println(i1);

        // 1050
        long compare3 = sc.nextLong(), compare4 = sc.nextLong();
        int i2 = compare3==compare4 ? 1 : 0;
        System.out.println(i2);
    }
}
