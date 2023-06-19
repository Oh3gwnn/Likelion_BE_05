package javaproject2.week3.day11;

public class NewSwitchCaseClinic {
    public static void main(String[] args) {
        String day = "금";
        String time = switch(day) {
            case "월", "수", "목" -> "09:30-18:30";
            case "화" -> "09:30-18:30\n - 10:30-12:00 수술";
            case "금" -> "09:30-18:30\n - 14:20-16:10 수술";
            case "토" -> "09:30-15:00";
            case "일" -> "휴진";
            default -> throw new IllegalArgumentException("잘못 입력하셨습니다.");
        };
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
