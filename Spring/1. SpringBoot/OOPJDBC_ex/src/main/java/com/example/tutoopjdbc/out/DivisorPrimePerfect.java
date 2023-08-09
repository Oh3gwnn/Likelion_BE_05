package com.example.tutoopjdbc.out;

public class DivisorPrimePerfect {
    public static int isDivisor(int num) {
        int cnt = 0;
        for (int i = 1; i*i <= num; i++) {
            if(i*i == num) cnt++;
            else if(num % i == 0) cnt+=2;
        }
        return cnt;
    }

    public static boolean isPrime(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i == 0) cnt += 1;
            if(cnt >= 3) return false;
        }
        return true;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if(num%i==0) sum += i;
        if(num==sum) return true;
        else return false;
    }
}
