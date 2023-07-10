package javaproject2.programmers;

public class CollatzConjecture_12943 {
    public int solution(long num) {
        int answer = 0;
        while (num > 1) {
            // 500번 시도에도 1이 되지 않는 경우
            if (answer == 500) return -1;

            if (num % 2 == 0) num /= 2;
            else num = (num * 3) +1;
            answer += 1;
        }
        return answer;
    }
}

//파이썬 풀이
//def solution(num):
//    answer = 0
//    while (num > 1):
//    num = num / 2 if (num % 2 == 0) else (num * 3) +1
//    answer += 1
//    if answer == 500 : return -1
//    return answer