package javaproject2.week2.day08;

public class MyAccount {
    public static void main(String[] args) {
        int myAccount = 1_000_000;
        myAccount = myAccount - 500_000;
        System.out.println(myAccount); // 50만원 출금
        myAccount = myAccount + 4_000_000;
        System.out.println(myAccount); // 400만원 입금
    }
}
