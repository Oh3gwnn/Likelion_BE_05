package javaproject2.week4.day18;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(14);
        user1.setName("김미밈");

        User user2 = new User();
        user2.setAge(33);
        user2.setName("기남나");

        System.out.printf("%s는 어른인지? %b\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 어른인지? %b\n", user2.getName(), user2.isAdult());
    }
}
