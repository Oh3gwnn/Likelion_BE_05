package javaproject2.week2.day06;

public class NarrowingCasting {
    public static void main(String[] args) {

        // 112
        System.out.println(1 + "1");
        // int result = 1 + "1"; 컴파일 오류
        // int result = 1 + Integer.parseInt("1"); 맞게 작성하기

        // 113
        double dVal = 123.456;
        int iVal = (int) dVal;

        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);

        // 114
        String str = "1";
        int num = Integer.parseInt(str);
        System.out.println("num = " + num);

        // 숫자가 아닌 문자열은 안됨
        // NumberFormatException 발생
        // String str = "123ab";
        // int num = Integer.parseInt(str);

        // 115
        // String + String?
        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println("val1 + val2 = " + val1 + val2);

        // float 타입으로 변환한 String + String
        String val3 = "1.5";
        String val4 = "2.5";
        float result = Float.parseFloat(val3) + Float.parseFloat(val4);
        System.out.println("val3 + val4 = " + result);

        // NumberFormatException 오류
//        String val3 = "1.5";
//        String val4 = "2.5";
//
//        int result3 = Integer.parseInt(val3) + Integer.parseInt(val4);
//        System.out.println("result = " + result3);
    }
}
