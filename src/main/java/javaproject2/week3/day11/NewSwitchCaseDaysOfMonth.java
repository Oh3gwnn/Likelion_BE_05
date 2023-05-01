package javaproject2.week3.day11;

public class NewSwitchCaseDaysOfMonth {
    public static void main(String[] args) {
        int month = 13;
        int lastDate = switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            // IllegalArgumentException
            // (런타임 에러: 부적합한, 부적절한 인수를 메소드에 전달)
            // 위에선 case에 해당하는 인수가 없을 경우 출력된다.
            default -> throw new IllegalArgumentException("1~12월을 입력해주세요: " + month);
        };
        System.out.printf("%월은 %d일까지 있습니다.", month, lastDate);
    }
}
