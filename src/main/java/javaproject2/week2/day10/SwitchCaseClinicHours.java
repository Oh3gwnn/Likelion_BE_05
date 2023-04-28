package javaproject2.week2.day10;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "화";
        String time = "";

        switch (day) {
            case "월", "수", "목": time = "09:30-18:30"; break;
            case "화": time = "09:30-18:30\n - 10:30-12:00 수술"; break;
            case "금": time = "09:30-18:30\n - 14:20-16:10 수술"; break;
            case "토": time = "09:30-15:00"; break;
            case "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);

    }
}
