package javaproject2.week4.day15;

class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory ufo = new UserFactory();
        User user = ufo.getAdultUser();
        System.out.println(user.age);
    }
}