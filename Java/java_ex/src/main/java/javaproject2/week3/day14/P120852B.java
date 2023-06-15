package javaproject2.week3.day14;

public class P120852B {
    public static void main(String[] args) {
        /** 초안 **/
//        int n = 12;
//        int divisor = 2;
//        int[] arr = new int[n+1];   // 12개나 만들어야 하나?
//        // dynamic programming
//        // List, Set, Map
//
//        for (int i = 2; n > 1; i++) {
//            System.out.println(i);
//            if (n % i == 0) {       // 나누어 떨어지는지?
//                arr[divisor] = i;
//                n /= i;
//            }
//        }
//        System.out.println(arr);

//        /** 개선 1 **/
//        int n = 12;
//        int divisor = 2;
//        int[] arr = new int[n + 1];
//        int idx = 0;
//
//        while (n > 1) {
//            if (n % divisor == 0) {       // 나누어 떨어지는지?
//                arr[idx++] = divisor;
//                n /= divisor;
//            } else {
//                // 12 --> 6 --> 3인 경우 2로 안 나누어 떨어진다.
//                divisor++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);


        /** 개선 2 **/
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1];

        while (n > 1) {
            if (n % divisor == 0) {
                arr[divisor] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                size++;
            }
        }

        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[idx++] = arr[i];
            }
        }
        for (int i = 0; i < answer.length; i++) System.out.printf("%d ", answer[i]);
    }
}
