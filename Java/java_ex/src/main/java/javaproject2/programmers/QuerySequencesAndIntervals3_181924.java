package javaproject2.programmers;

public class QuerySequencesAndIntervals3_181924 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] que : queries) {
            int temp = arr[que[0]];
            arr[que[0]] = arr[que[1]];
            arr[que[1]] = temp;
        }
        return arr;
    }
}
// 파이썬
//    def solution(arr, queries):
//        for a, b in queries: arr[a], arr[b] = arr[b], arr[a]
//        return arr