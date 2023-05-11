package javaproject2.week4.day18;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User("김미밈", "010-1234-1234", 33);
        users.add(user1);

        User user2 = new User("김나나", "010-4321-1234", 13);
        users.add(user2);

        for (User user : users) {
            System.out.printf("%s님의 전화번호는 %s입니다.\n", user.getName(), user.getPhoneNumber());
        }
    }
}
