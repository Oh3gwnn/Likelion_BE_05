package javaproject2.week3.day12;

public class WhileCountFactorial {
    public static void main(String[] args) {
        // count 가로 출력
        int cnt = 0;
        while (cnt < 11) System.out.printf("%d ", cnt++);
        System.out.println();

        // count reverse
        int cnt2 = 10;
        while (cnt2 >= 0) System.out.printf("%d ", cnt2--);
        System.out.println();

        // factorial
        int num = 5;
        int answer = 1;
        while (num > 0){
            answer *= num--;
            System.out.printf("%d ", answer); // 가로 출력
        }
    }
}
