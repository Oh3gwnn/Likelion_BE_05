package javaproject2.week2.day07;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";

        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) System.out.printf("%s ", strArr[i]);
        System.out.printf("\n");

        String strArr2[] = str.split(" ");
        for (int i = 0; i < strArr.length; i++) System.out.printf("%s ", strArr2[i]);
        System.out.printf("\n");

        System.out.println(Arrays.asList(strArr2)); // string 배열 출력하기

    }
}
