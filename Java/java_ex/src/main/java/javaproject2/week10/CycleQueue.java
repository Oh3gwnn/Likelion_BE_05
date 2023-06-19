package javaproject2.week10;

public class CycleQueue {
    private final int size = 4;
    private final int[] arr = new int[size + 1];
    private int front = 0;
    private int rear = 0;

    public CycleQueue() {}

    // 데이터 추가
    public void enQueue(int n) {
        // 다음 데이터 추가 위치: (rear + 1) % (size + 1)
        // 다음 데이터 나올 곳과 일치 할 경우 Full
        if ((rear + 1) % (size + 1) == front) throw new RuntimeException("queue is full");
        rear = (rear + 1) % (size + 1);
        arr[rear] = n;
    }

    // 데이터 회수
    public int deQueue() {
        if (front == rear) throw new RuntimeException("queue is empty");
        front = (front + 1) % (size + 1);
        return arr[front];
    }

    // 큐 비어있는지 확인
    public boolean isEmpty() {
        return front == rear;
    }

    public static void main(String[] args) {
        CycleQueue cq = new CycleQueue();
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        System.out.println(cq.deQueue());
        System.out.println(cq.deQueue());
        cq.enQueue(5);
        cq.enQueue(6);
    }
}
