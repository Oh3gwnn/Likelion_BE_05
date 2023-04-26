package javaproject2.week2.day08;

public class LikeAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;
        likeCount += 1;
        System.out.println(likeCount); // Like +1

        likeCount += 1;
        System.out.println(likeCount); // Again Like +1

        likeCount -= 1;
        System.out.println(likeCount); // Cancel Like
    }
}
