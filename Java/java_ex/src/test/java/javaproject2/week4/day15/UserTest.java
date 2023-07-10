package javaproject2.week4.day15;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "ㅇㅎㄹ";
        user1.age = 11;

        User user2 = new User();
        user2.name = "ㅈㅇ";
        user2.age = 55;

        System.out.printf("%s는 성인입니까? %s\n", user1.name, user1.isAdult());
        System.out.printf("%s는 성인입니까? %s\n", user2.name, user2.isAdult());
    }
}