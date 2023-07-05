package javaproject2.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinZero {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer info = new StringTokenizer(reader.readLine());
        int coinKinds = Integer.parseInt(info.nextToken());     // 동전 종류
        int targetAmount = Integer.parseInt(info.nextToken());  // 만들고자 하는 금액
        int[] coinAmounts = new int[coinKinds];                 // 개별 동전의 가치

        // 큰 동전부터 인덱싱하기 위해 역순 입력
        for (int i = 0; i < coinKinds; i++) {
            coinAmounts[coinKinds - i - 1] = Integer.parseInt(reader.readLine());
        }

        // 실제 사용한 동전 갯수
        int coinUsed = 0;

        // 1. 사전적으로 풀이
        int currentCoin = 0;
        // 거슬러 줄 금액이 남아있는 동안 반복한다.
        while (targetAmount > 0) {
            if (targetAmount >= coinAmounts[currentCoin]) {
                // 사용한다.
                targetAmount -= coinAmounts[currentCoin];
                coinUsed++;
            }
            // 아니라면 다음 동전 사용
            else currentCoin++;
        }

        // 2. 수학적으로 계산
        // 큰 동전부터 순서대로 확인
        for (int i = 0; i < coinKinds; i++) {
            // 남은 금액에서 현재 동전으로 지불할 수 있는 최대 갯수
            coinUsed += targetAmount / coinAmounts[i];
            // 지불하고 남은 금액 정산
            targetAmount %= coinAmounts[i];
        }

        return coinUsed;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new CoinZero().solution());
    }
}