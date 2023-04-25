package javaproject2.week2;

public class StringConcat {
    public static void main(String[] args) {
        String name = "택";
        int balance = 100000000;

        String message1 = name + "님의 통장 잔고는 " + balance + "원입니다.";
        System.out.println(message1);

        System.out.printf("%s님의 통장 잔고는 %d원입니다.\n", name, balance);

        String message2 = String.format("%s님의 통장 잔고는 %d원입니다.", name, balance);
        System.out.println(message2);


    }
}
