package javaproject2.programmers;

public class QuerySequencesAndIntervals4_181922 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] tmp = arr;
            for (int[] que : queries) {
                for(int i = que[0]; i <= que[1]; i++) {
                    if (i % que[2] == 0) {
                        arr[i] += 1;
                    }
                }
            }
            return arr;
        }
    }
}
// 파이썬
//def solution(arr, queries):
//        tmp = [0]*5
//
//        for s, e, k in queries:
//          for i in range(s, e+1):
//              if i % k == 0:
//                  arr[i] += 1
//
//        return arr