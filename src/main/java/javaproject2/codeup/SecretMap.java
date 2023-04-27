package javaproject2.codeup;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            while (str.length() != n) str = "0" + str;
            answer[i] = str.replace('0', ' ').replace('1', '#');
        }

        return answer;
    }
}

/** 파이썬으로 한고..
 * def solution(n, arr1, arr2):
 *     answer = []
 *
 *     for i in range(n):
 *         num = bin(arr1[i] | arr2[i])[2:].zfill(n)
 *         num = num.replace('0', ' ').replace('1', '#')
 *         answer.append(num)
 *
 *     return answer
 **/