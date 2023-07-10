package javaproject2.codeup.question81to90;

import java.util.Scanner;

public class CodeUp87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        int i = 1, sumf = 0;

        while (true) {
            if (sumf >= fact) {System.out.println(sumf); break;}
            else sumf += i;
            i++;
        }
    }
}
