package javaproject2.week3.day11;

public class LoopChar {
    public static void main(String[] args) {
        // 문자열도 루프가 된다.(신기)
        for (char c = 'a'; c <= 'z'; c++) System.out.printf("%c ", c);
        System.out.println();

        // integer 형
        for (int c = 'A'; c <= 'Z'; c++) System.out.printf("%d ", c);

        // 유니코드(영문, 한글)
        for (int c = 65; c <= 'Z'; c++) {
            if (c%10==5) System.out.println();
            System.out.printf("%c(%d) ", c, c);
        }
        for (int c = '가'; c <= '갓'; c++) {
            if (c%10==2) System.out.println();
            System.out.printf("%c(%d) ", c, c);
        }
    }
}
