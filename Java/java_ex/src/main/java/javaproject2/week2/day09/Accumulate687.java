package javaproject2.week2.day09;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        answer += num % 10;
        num /= 10;

        System.out.printf("num:%d\nanswer:%d", num, answer);
    }
}
