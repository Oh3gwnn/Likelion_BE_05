package javaproject2.week4.day16;

public class MultiplicationTable {
    private String multipleSymbol;

    public MultiplicationTable(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan(int dan) {
        for (int i = 1; i < 9; i++) {
            System.out.printf("%2d %s %2d = %3d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable("X");
        mt.printDan(37);

        MultiplicationTable mt2 = new MultiplicationTable("*");
        mt2.printDan(54);
    }
}
