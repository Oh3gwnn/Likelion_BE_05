package javaproject2.week9;

public class MyStack {
    // 스택 실제 데이터 저장
    private final int[] arr = new int[16];
    // 현재 스택 최고점 - top
    private int top = -1;

    public MyStack() {}

    // 1. PUSH
    public void push(int data) {
        // Stack 가득 찼는지
        if (arr.length - 1 == top) throw new RuntimeException("STACK FULL");
        arr[++top] = data;
    }

    // 2. POP
    public int pop() {
        // Stack 비었는지
        if (top == -1) throw new RuntimeException("STACK EMPTY");
        return arr[top--];
    }

    // 3. PEEK
    public int peek() {
        if (top == -1) throw new RuntimeException("STACK EMPTY");
        return arr[top];
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(2);
        System.out.println(st.pop());
    }
}
