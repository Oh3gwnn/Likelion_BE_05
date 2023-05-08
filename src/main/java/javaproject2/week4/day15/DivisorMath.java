package javaproject2.week4.day15;

public class DivisorMath {

    int sumOfFactors(int num) {
        int answer = 1;
        for (int i = 2; i <= num; i++) if(num % i == 0) answer += i;
        return answer;
    }

    void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        DivisorMath divisorMath = new DivisorMath();
        divisorMath.printResult(12);
        divisorMath.printResult(36);
        divisorMath.printResult(48);
        divisorMath.printResult(29);
    }
}
