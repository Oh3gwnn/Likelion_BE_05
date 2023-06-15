package javaproject2.week3.day13;

public class Factors {
    public static void main(String[] args) {
        int n = 5;

        // 1 계산 출력
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %% %d = %d\n", n, i, n % i);
        }

        // 2 나머지 0
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d %% %d = %d\n", n, i, n % i);
            }
        }

        // 3 약수
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
