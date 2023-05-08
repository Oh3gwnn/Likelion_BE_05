package javaproject2.codeup;

import java.util.Scanner;

public class Q1671 {
    public static void Play(int user, int com) {
        if (user == com) System.out.println("tie");
        else if ((user==0 && com == 2) || (user==1 && com == 0) || (user==2 && com == 1)){
            System.out.println("lose");
        }
        else System.out.println("win");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt(), com = sc.nextInt();
        Play(user, com);
    }
}