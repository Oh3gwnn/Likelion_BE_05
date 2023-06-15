package javaproject2.week4.day16;

public class MaxMinEx extends MaxandMinOpr{
    public static void main(String[] args) {
        MaxMinEx mme = new MaxMinEx();

        mme.MaxOpr(50, 30); // 50 > 30 --> true
        mme.MinOpr(50, 30); // 50 < 30 --> false
    }
}
