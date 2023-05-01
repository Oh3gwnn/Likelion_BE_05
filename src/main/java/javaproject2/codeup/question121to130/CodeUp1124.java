package javaproject2.codeup.question121to130;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int idx = str.indexOf('H');
        int a = Integer.parseInt(str.substring(1,idx));
        int b = Integer.parseInt(str.substring(idx+1, str.length()));
        System.out.printf("%d", 12*a+b);
    }
}