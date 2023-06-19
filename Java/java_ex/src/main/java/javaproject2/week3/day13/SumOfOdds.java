package javaproject2.week3.day13;

import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
