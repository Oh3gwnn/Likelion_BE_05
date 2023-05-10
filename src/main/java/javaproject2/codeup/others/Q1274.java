package javaproject2.codeup.others;

import java.util.Scanner;

public class Q1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 3) System.out.println("prime");
        else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0){
                    n = -1;
                    break;
                }
            }
            if (n == -1) System.out.println("not prime");
            else System.out.println("prime");
        }
    }
}