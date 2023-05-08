package javaproject2.week4.day15;

public class UserFactory {
    public User getAdultUser() {
        User user = new User();
        user.age = 34;
        return user;
    }
}
