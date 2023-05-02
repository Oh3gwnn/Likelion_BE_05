package javaproject2.week3.day12;

public class WhileFactorial {
    public static void main(String[] args) {
        int num = 5;
        int answer = 1;
        while (num > 0){
            answer *= num--;
            System.out.printf("%d ", answer); // 가로 출력
        }
    }
}
