package javaproject2.week2.day01;

public class FloatLength {
    public static void main(String[] args) {
        // float 변수 선언 및 초기화
        float f1 = 3.14f;
        float f2 = 1.23e10f;

        // double 변수 선언 및 초기화
        double d1 = 3.141592653589793;
        double d2 = 1.23e100;  // float이 아니라 double에 담아서 원하는 결과 출력(크기 문제)

        // float과 double 변수의 계산
        float result1 = f1 * 2.0f;
        double result2 = d1 / 2.0;

        // float과 double 변수의 출력
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);


        // 에러
        // float f3 = 3.141592653589793;
        float f3 = 3.141592653589793f;
        double d3 = 3.141592653589793;
        System.out.println(f3); // 3.1415927 (소수점 아래 7자리까지)
        System.out.println(d3); // 3.141592653589793
    }
}
