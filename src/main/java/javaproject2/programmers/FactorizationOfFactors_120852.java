package javaproject2.programmers;
import java.util.ArrayList;
public class FactorizationOfFactors_120852 {

    class Solution {
        public int[] solution(int n) {
            ArrayList<Integer> factors = new ArrayList<Integer>();
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    if (!factors.contains(i)) factors.add(i);
                    n /= i;
                }
            }

            int[] answer = new int[factors.size()];
            for (int i = 0; i < factors.size(); i++) {
                answer[i] = factors.get(i);
            }
            return answer;
        }
    }
}
//파이썬
//    def solution(n):
//        answer = []
//        i = 2
//        while(i<n+1):
//            if n%i==0:
//                if i not in answer:
//                    answer.append(i)
//                n = int(n/i)
//                i = 2
//        else:
//            i += 1
//        return answer