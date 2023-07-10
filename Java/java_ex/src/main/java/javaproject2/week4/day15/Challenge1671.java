package javaproject2.week4.day15;

import java.util.Scanner;

public class Challenge1671 {
    public String Play(String user, int com) {
        int use = 0;
        switch (user) {
            case "가위": use = 1;
            case "바위": use = 0;
            case "보": use = 2;
        }
        if (use == com) return "tie";
        else if ((use==0 && com == 2) || (use==1 && com == 0) || (use==2 && com == 1)){
            return "lose";
        } else return "win";
    }

    public static void main(String[] args) {
        Challenge1671 q1671 = new Challenge1671();
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            System.out.printf("가위, 바위, 보 : ");
            cnt += 1;
            String user = sc.nextLine();
            int com = (int)(Math.random() * 3);
            String res = q1671.Play(user, com);

            if (res == "win") {
                System.out.printf("%d번 가위바위보 후 이겼습니다.", cnt);
                break;
            }
            else if (res == "tie") System.out.println("비겼습니다.");
            else System.out.println("졌습니다.");
        }
    }
}