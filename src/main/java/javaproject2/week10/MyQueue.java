package javaproject2.week10;

import javaproject2.week9.MyStack;

public class MyQueue {
    private final int[] arr = new int[4];

    // Queue 데이터 꺼내는 위치
    private int front = -1;

    // Queue 데이터 추가 위치
    private int rear = -1;

    public MyQueue() {}

    // 데이터 추가
    public void enQueue(int n) {
        // rear + 1이 배열 크기만해질 때
        if (rear == arr.length - 1) throw new RuntimeException("queue is full");
        arr[++rear] = n; // rear++ -> arr[rear]에 data 할당
    }

    // 데이터 회수
    public int deQueue() {
        // rear == front -> 비어있는 큐
        if (front == rear) throw new RuntimeException("queue is empty");
        return arr[++front];
    }

    // 큐 비어있는지 확인
    public boolean isEmpty() {
        return front == rear;
    }

    // 다음 데이터 확인
    public int peek() {
        if (isEmpty()) throw new RuntimeException("queue is empty");
        return arr[front+1];
    }

    public static void main(String[] args) {
        MyQueue que = new MyQueue();
        que.enQueue(1);
        que.enQueue(2);
        que.enQueue(3);
        System.out.println(que.deQueue());
        System.out.println(que.deQueue());
        System.out.println(que.deQueue());

        que.enQueue(4);
        System.out.println(que.deQueue());

        // queue is full -> 위치는 복구가 안되기 때문
        que.enQueue(5);
        que.enQueue(6);
    }
}
