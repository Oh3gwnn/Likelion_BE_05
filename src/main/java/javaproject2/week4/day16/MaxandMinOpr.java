package javaproject2.week4.day16;

public abstract class MaxandMinOpr {
    public void printbool(boolean maxmin) {
        System.out.println(maxmin);
    }

    public void MaxOpr(int num1, int num2) {
        printbool(num1 > num2);
    }

    public void MinOpr(int num1, int num2) {
        printbool(num1 < num2);
    }
}
