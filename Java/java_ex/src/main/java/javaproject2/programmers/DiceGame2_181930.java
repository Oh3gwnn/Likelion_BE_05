package javaproject2.programmers;

public class DiceGame2_181930 {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        if (a==b & b==c) {
            answer = answer * (a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }
        else if (a==b || b==c || c==a) {
            answer = answer * (a*a+b*b+c*c);
        }
        return answer;
    }
}

/** 파이썬 풀이 **/
//    def solution(a, b, c):
//        answer = a+b+c
//
//        # | 대신 or 사용 가능
//        if a == b or b == c or c == a :
//        answer = (a+b+c)*(a**2+b**2+c**2)
//        # a==b==c 이런 식으로 3개 인수 비교 가능
//        if (a == b == c):
//        answer = (a+b+c)*(a**2+b**2+c**2)*(a**3+b**3+c**3)
//
//        return answer
