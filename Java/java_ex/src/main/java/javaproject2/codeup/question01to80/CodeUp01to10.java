package javaproject2.codeup.question01to80;

import java.util.Scanner;

public class CodeUp01to10 {
    public static void main(String[] args) {
        System.out.println("Hello");                    // 1001
        System.out.println("Hello World");              // 1002
        System.out.println("Hello\nWorld");             // 1003
        System.out.println("\'Hello\'");                // 1004
        System.out.println("\"Hello World\"");          // 1005
        System.out.println("\"!@#$%^&*()\"");          // 1006
        System.out.println("\"C:\\Download\\hello.cpp\"");  // 1007
        System.out.println("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518");  // 1008

        // 1010 (import Scanner 까지)
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
    }
}
