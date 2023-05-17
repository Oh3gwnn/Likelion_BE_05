package javaproject2.week5.day22;

import java.util.Arrays;

public class Stack01 {
    private int[] arr = new int[10];
    private int pointer = 0;

    public void push(int val) {
        this.arr[pointer++] = val;
        System.out.println(Arrays.toString(arr));
        System.out.println("pointer = " + pointer);
    }

    public static void main(String[] args) {
        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);
        st.push(30);
    }
}
