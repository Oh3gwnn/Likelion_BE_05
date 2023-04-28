package javaproject2.week2.day10;

public class ElseIfEx {
    public static void main(String[] args) {
/** else if 잘못된 예제
 * 목적을 달성하기 위해선 "B"만 출력해야한다. **/
//        int score = 81;
//        if (score >= 90) { // false
//            System.out.println("A");
//        } if (score >= 80) { // true
//            System.out.println("B");
//        } if (score >= 70) { // true
//            System.out.println("C");
//        }
        int score = 75;

        if (score >= 90) System.out.println("A");       // false
        else if (score >= 80) System.out.println("B");  // false
        else if (score >= 70) System.out.println("C");  // true
        else System.out.println("F");
    }
}
