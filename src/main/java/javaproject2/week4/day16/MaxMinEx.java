package javaproject2.week4.day16;

public class MaxMinEx {
    public static void main(String[] args) {
        MaxOpr maxOpr = new MaxOpr();
        MinOpr minOpr = new MinOpr();

        maxOpr.printbool(50, 30); // 50 > 30 --> true
        minOpr.printbool(50, 30); // 50 < 30 --> false

    }
}
