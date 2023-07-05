package javaproject2.week12;

import java.util.Arrays;

public class Combinations {
    private void combNumbers(
            // nCr
            int n, int r,
            // 지금까지 고른 원소의 갯수 (완성될 조합의 몇번째 원소를 고르는 중인지)
            int k,
            // 현재 조합에 포함시킬지 고려중인 숫자
            int next,
            // 작성중인 조합
            int[] comb
    ){
        // 고를 만큼 골랐다.
        if (k == r) {
            System.out.println(Arrays.toString(comb));
        }
        // 아직 다 안골랐는데 더이상 고를 숫자가 없다.
        else if (next == n) {
            // 조합 생성 실패
            return;
        }
        else {
            // 현재 만드는 조합의 K 번째에 next 를 넣는다.
            comb[k] = next;
            // next를 선택했다면, k + 1 번째에
            // next + 1을 할당할지 말지를 결정하러 재귀호출
            combNumbers(n, r, k + 1, next + 1, comb);
            // next를 선택하지 않았다면, k 번째에
            // next + 1을 할당할지 말지를 결정하러 재귀호출
            // 이때 comb[k] = next에서 할당한 값이 덮어씌워진다.
            combNumbers(n, r, k, next + 1, comb);
        }
    }
}
