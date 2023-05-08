package javaproject2.week4.day15;

public class Challenge1671 {
    public String Play(int user, int com) {
        if (user == com) return "tie";
        else if ((user==0 && com == 2) || (user==1 && com == 0) || (user==2 && com == 1)){
            return "lose";
        } else return "win";
    }

    public static void main(String[] args) {
        Challenge1671 q1671 = new Challenge1671();
        int user = 0, com = 0, cnt = 0;

        while (true) {
            cnt += 1;
            user = (int)(Math.random() * 2);
            com = (int)(Math.random() * 2);
            if (q1671.Play(user, com) == "win") {
                System.out.printf("%d번 가위바위보 후 이겼습니다.", cnt);
                break;
            }
        }
    }
}