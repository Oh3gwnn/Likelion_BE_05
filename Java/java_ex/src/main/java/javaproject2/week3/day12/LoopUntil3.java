package javaproject2.week3.day12;

public class LoopUntil3 {
    public static void main(String[] args) throws InterruptedException {
        // for 조건문에 연산이 들어간다.
        for (int i = 2; i * i <= 50; i++) System.out.printf("%d ", i);
        System.out.println();

        // 무한 반복(시간 메소드로 확인)
//        while (true) {
//            System.out.println(LocalDateTime.now());
//            Thread.sleep(1000);
//        }

        // while countdown
        int cnt = 0;
        while (cnt < 11){
            System.out.printf("%d ", cnt++);
        }

    }
}
