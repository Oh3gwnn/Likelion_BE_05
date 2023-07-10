package javaproject2.programmers;

public class QuerySequencesAndIntervals2_181923 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int num = 0;

        for (int[] que : queries) {
            int tmp = 0;

            for(int i = que[0]; i <= que[1]; i++) {
                if (que[2] < arr[i]) {
                    if (tmp == 0 || arr[i] < tmp) tmp = arr[i];
                }
            }
            if (tmp == 0) tmp = -1;

            answer[num] = tmp;
            num += 1;
        }
        return answer;
    }
}
// 파이썬
//def solution(arr, queries):
//        answer = []
//
//        for s, e, k in queries:
//        tmp = 0
//        for i in range(s, e+1):
//          if k < arr[i]:
//              if tmp == 0 or arr[i] < tmp: tmp = arr[i]
//
//        if tmp == 0: answer.append(-1)
//        else: answer.append(tmp)
//
//        return answer