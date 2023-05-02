package javaproject2.programmers;

public class AddADigit_12931 {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

// 파이썬
// def solution(n): return sum([int(i) for i in str(n)])


