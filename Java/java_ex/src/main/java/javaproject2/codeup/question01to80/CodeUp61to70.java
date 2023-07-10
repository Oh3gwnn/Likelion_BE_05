package javaproject2.codeup.question01to80;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp61to70 {
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

        // 1061
        int bitwise1 = sc.nextInt() | sc.nextInt();
        System.out.println(bitwise1);

        // 1062
        int bitwise2 = sc.nextInt() ^ sc.nextInt();
        System.out.println(bitwise2);

        // 1063
        int cpr1 = sc.nextInt(), cpr2 = sc.nextInt();
        int res1 = cpr1 > cpr2 ? cpr1 : cpr2;
        System.out.println(res1);

        // 1064
        int cprA = sc.nextInt(), cprB = sc.nextInt(), cprC = sc.nextInt();
        int res2 = (cprA < cprB ? cprA : cprB) < cprC ? (cprA < cprB ? cprA : cprB) : cprC;
        System.out.println(res2);

        // 1065
        int nA = sc.nextInt(), nB = sc.nextInt(), nC = sc.nextInt();
        if (nA%2==0) System.out.println(nA);
        if (nB%2==0) System.out.println(nB);
        if (nC%2==0) System.out.println(nC);

        // 1066
        int nA1 = sc.nextInt(), nB2 = sc.nextInt(), nC3 = sc.nextInt();
        if (nA1%2==0) System.out.println("even");
        else System.out.println("odd");
        if (nB2%2==0) System.out.println("even");
        else System.out.println("odd");
        if (nC3%2==0) System.out.println("even");
        else System.out.println("odd");

        // 1067
        int compare = sc.nextInt();
        if (compare>0) System.out.println("plus");
        else System.out.println("minus");
        if (compare%2==0) System.out.println("even");
        else System.out.println("odd");

        // 1068
        int grade = sc.nextInt();
        if (grade>=90) System.out.println("A");
        else if (89 >= grade && grade >= 70) System.out.println("B");
        else if (69 >= grade && grade >= 40) System.out.println("C");
        else System.out.println("D");

        // 1069
        char grade2 = sc.next().charAt(0);
        switch (grade2) {
            case 'A': System.out.println("best!!!"); break;
            case 'B': System.out.println("good!!"); break;
            case 'C': System.out.println("run!"); break;
            case 'D': System.out.println("slowly~"); break;
            default: System.out.println("what?");
        }

        // 1070
        int month = sc.nextInt();
        switch (month) {
            case 12: case 1: case 2: System.out.println("winter"); break;
            case 3: case 4: case 5: System.out.println("spring"); break;
            case 6: case 7: case 8: System.out.println("summer"); break;
            case 9: case 10: case 11: System.out.println("fall"); break;
        }
    }
}
