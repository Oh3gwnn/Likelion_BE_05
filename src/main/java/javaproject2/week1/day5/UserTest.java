package javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "택";
        user.phoneNumber = "010-0000-0000";
        user.age = 26;

        User kid = new User();
        kid.name = "어린이";
        kid.phoneNumber = "010-0033-0000";
        kid.age = 11;

        User adt = new User();
        adt.name = "어른이";
        adt.phoneNumber = "010-0011-0000";
        adt.age = 20;

        System.out.printf("%s님은 성인입니까? %s\n", user.name, user.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", kid.name, kid.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", adt.name, adt.isAdult());
    }
}
