package javaproject2.week3.day13;

public class IsPrime {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 2; i < num; i++) {
            System.out.printf("%d %% %d = %d\n", num, i, num % i);
        }

        int factors = 0;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                factors++;
            }
        }
        System.out.println("factors: " + factors);
        System.out.println(factors == 0);
    }
}
