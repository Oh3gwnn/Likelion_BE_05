package javaproject2.week4.day15;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient = account.isSufficient();
        if(isSufficient) System.out.println("결제 요청");
        else System.out.println("잔액 부족");
    }
}
