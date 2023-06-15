package javaproject2.week2.day09;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45; // 물 온도
        int roomTemperature = 22; // 실내 온도

        boolean check = (waterTemperature < 50) && (roomTemperature < 24);
        System.out.printf("check: %b\n", check);
        // 물 온도가 45도 < 50도 미만이고(true)
        // 실내 온도가 22도 < 24도 미만(true)
        // AND(&&) 연산 결과 check: true
    }

}
