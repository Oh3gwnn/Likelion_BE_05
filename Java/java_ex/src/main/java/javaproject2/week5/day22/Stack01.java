package javaproject2.week5.day22;

import java.util.EmptyStackException;

public class Stack01 {
    private int[] arr = new int[10];
    private int pointer = 0;

    public void push(int val) {
        this.arr[pointer++] = val;
        System.out.println(pointer);
    }

    public int pop() {
        if (!isEmpty()) return arr[--pointer];
        else throw new EmptyStackException();
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[pointer-1];
    }

    public static void main(String[] args) {
        Stack01 st = new Stack01();
        st.push(20);
        System.out.println(st.pop());
        st.push(30);
        System.out.println(st.peek());
    }
}
