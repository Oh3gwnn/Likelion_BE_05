package javaproject2.week1.day1to4;

import java.time.LocalDate;
public class PrintfEX {
    void print() {
        System.out.printf("%s", "Hi");
    }

    public static void main(String[] args) {
        // PrintfEX printfEX = new PrintfEX();
        // printfEX.print();

        LocalDate now = LocalDate.now();
        System.out.printf("%s", now);
    }
}
