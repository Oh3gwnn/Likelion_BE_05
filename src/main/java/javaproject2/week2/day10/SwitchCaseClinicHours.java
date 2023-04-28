package javaproject2.week2.day10;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "토";
        String time = "";

        switch (day) {
            case "월", "화", "목", "금": time = "09:30-18:30"; break;
            case "토": time = "09:30-13:00"; break;
            case "수", "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);

    }
}
