package javaproject2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp31to40 {
    /* Main 클래스 복붙용
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        }
    }

    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

        }
    }
    */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 1031
        int A = sc.nextInt();
        System.out.printf("%o", A);

        // 1032
        int B = sc.nextInt();
        System.out.printf("%x", B);

        // 1033
        int C = sc.nextInt();
        System.out.printf("%X", C);

        // 1034
        String D = sc.next();
        System.out.printf("%d", Integer.parseInt(D, 8));

        // 1035
        String E = sc.next();
        System.out.printf("%o", Integer.parseInt(E, 16));

        // 1036 import InputStreamReader
        InputStreamReader is = new InputStreamReader(System.in);
        int ascii = is.read();
        System.out.printf("%d", ascii);

        /** is 안받고 얘도 됨
        int chtonum = (int)sc.next().charAt(0);
        System.out.println(chtonum);
        **/

        // 1037
        char numtoch = (char)sc.nextInt();
        System.out.println(numtoch);

        // 1038, 1039
        long ln1 = sc.nextLong();
        long ln2 = sc.nextLong();
        System.out.printf("%d",ln1 + ln2);

        // 1040
        long reln = sc.nextLong();
        System.out.printf("%d", reln * -1);
    }
}
