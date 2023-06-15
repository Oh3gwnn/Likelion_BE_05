package javaproject2.programmers;

public class SpecialTwoDimArr1_181833 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++) answer[i][i] = 1;
        return answer;
    }
}

//    def solution(n):
//        answer = [[0]*n for i in range(n)]
//        for i in range(n): answer[i][i] = 1
//        return answer
