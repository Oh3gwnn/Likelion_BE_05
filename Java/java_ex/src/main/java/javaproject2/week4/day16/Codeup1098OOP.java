package javaproject2.week4.day16;

import java.util.Arrays;

public class Codeup1098OOP {

    private int[][] arr;
    private boolean printSeparator;

    public Codeup1098OOP(){
        this.arr = new int[5][5];
    }
    public Codeup1098OOP(boolean printSeparator){
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
    }
    public Codeup1098OOP(int rowCnt){
        this.arr = new int[rowCnt][5];
    }
    public Codeup1098OOP(int rowCnt, int colCnt){
        this.arr = new int[rowCnt][colCnt];
    }

    public void setBeam(int l, int direction, int x, int y) {
        for (int i = 0; i < l; i++) {
            if(direction == 0){ // 가로
                arr[x - 1][y + i - 1] = 1;
            } else { // 세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        int rowCnt = 5;
        int colCnt = 5;
//        Codeup1098OOP c1098 = new Codeup1098OOP();
//        Codeup1098OOP c1098 = new Codeup1098OOP(rowCnt);
//        Codeup1098OOP c1098 = new Codeup1098OOP(rowCnt, colCnt);
        Codeup1098OOP c1098 = new Codeup1098OOP(false);
        c1098.printArr();
        c1098.setBeam(2, 0, 1, 1);
        c1098.printArr();
        c1098.setBeam(3, 1, 2, 3);
        c1098.printArr();
        c1098.setBeam(4, 1, 2, 5);
        c1098.printArr();
    }
}
