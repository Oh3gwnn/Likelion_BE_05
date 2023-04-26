package javaproject2.week2.day08;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MinuteSecond {
    public static void main(String[] args) {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        Date date = new Date();

        int seconds = 239;
        int minute = seconds / 60;          // 분
        int remainSeconds = seconds % 60;   // 남은 초
        System.out.printf("%d분 %d초\n", minute, remainSeconds);

        // 자바 시간 메소드
        System.out.println(ts);
        System.out.println(date);
    }
}
