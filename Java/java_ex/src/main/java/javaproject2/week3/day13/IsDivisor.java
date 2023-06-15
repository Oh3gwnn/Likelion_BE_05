package javaproject2.week3.day13;

public class IsDivisor {
    public static void main(String[] args) {
        int n = 100, cnt = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.printf("%d ", i);
                cnt++;
            }
        }
        System.out.println("\n" + n + "의 약수는 " + cnt + "개 입니다.");
    }
}
