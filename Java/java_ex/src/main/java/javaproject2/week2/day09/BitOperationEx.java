package javaproject2.week2.day09;

public class BitOperationEx {
    public static void main(String[] args) {
        int val1 = 1; // 0001(1)
        System.out.println(val1 << 1);  // 0001(1) --> 0010(2)
        System.out.println(val1 << 2);  // 0010(2) --> 0100(4)
        System.out.println(val1 << 3);  // 0100(4) --> 1000(8)

        int val2 = 32; // 10 0000(32)
        System.out.println(val2 >> 1);  // 10 0000(32) --> 01 0000(16)
        System.out.println(val2 >> 2);  // 01 0000(16) --> 1000(8)
        System.out.println(val2 >> 3);  // 1000(8)     --> 0100(4)
    }
}
