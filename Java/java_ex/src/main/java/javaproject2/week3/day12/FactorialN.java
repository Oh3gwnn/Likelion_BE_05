package javaproject2.week3.day12;

public class FactorialN {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;
        for(int i = 1; i <= n; i++) answer *= i;
        System.out.println(answer);
    }
}
