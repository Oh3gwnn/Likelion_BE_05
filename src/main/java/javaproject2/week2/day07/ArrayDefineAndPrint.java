package javaproject2.week2.day07;

import java.util.Arrays;

public class ArrayDefineAndPrint {
    public static void main(String[] args) {
        int[] iArr = new int[]{1, 2, 3, 8}; // iArr length: 4
        System.out.println(Arrays.toString(iArr));

        float[] fArr = new float[3];
        String[] sArr = new String[10];
        System.out.println(Arrays.toString(fArr));
        System.out.println(Arrays.toString(sArr));
    }
}
