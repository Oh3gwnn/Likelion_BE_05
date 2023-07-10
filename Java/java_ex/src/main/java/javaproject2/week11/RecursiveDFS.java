package javaproject2.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class RecursiveDFS {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer: 입력받은 문자열을 ' '(또는 지정 값)을 기준으로 나누어서 한 단어로 반환
        // split()이랑 비슷
        StringTokenizer graphTokenizer = new StringTokenizer(br.readLine());
        // StringTokenizer.nextToken(): 다음 단어 가져오기
        int maxNode = Integer.parseInt(graphTokenizer.nextToken());
        int edge = Integer.parseInt(graphTokenizer.nextToken());

        // 인접 행렬: 2차원 배열
        // 노드가 1 ~ N+1 까지라면 계산할 때 매번 -1 하거나, 인접 행렬을 한칸 더 늘리거나
        int[][] adjMatrix = new int[maxNode][maxNode]; // 0~7 크기의 인접 행렬
        // 간선 갯수만큼 반복(입력 받기)
        for (int i = 0; i < edge; i++) {
            // 다음 줄을 단어 단위로 나눠주는 Tokenizer
            StringTokenizer edgeTokenizer = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(edgeTokenizer.nextToken()); // 입력 줄의 첫 숫자
            int endNode = Integer.parseInt(edgeTokenizer.nextToken()); // 입력 줄의 두 번째 숫자

            adjMatrix[startNode][endNode] = 1; // 유향 그래프의 경우, 이 라인만 추가
            adjMatrix[endNode][startNode] = 1; // 무향 그래프의 경우, 이 라인까지 추가
        }

        // 출력
//        for (int[] row: adjMatrix) System.out.println(Arrays.toString(row));
        boolean[] visited = new boolean[maxNode];
        List<Integer> visitOrder = new ArrayList<>();
        recursive(0, maxNode, adjMatrix, visited, visitOrder);
        System.out.println(visitOrder);
    }

    public void recursive(int next, int maxNode, int[][] adjMatrix,
                          boolean[] visited, List<Integer> visitOrder) {
        visited[next] = true; // 방문 표시
        visitOrder.add(next); // 방문 순서 기록
        // for -> 재귀호출
        for (int i = 0; i < maxNode; i++) {
            // 연결 O && 방문 X
            if (adjMatrix[next][i] == 1 && !visited[i]) {
                recursive(i, maxNode, adjMatrix, visited, visitOrder);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new RecursiveDFS().solution();
    }
}

// 정점의 갯수, 간선의 갯수
/*
8 10
0 1
0 2
0 3
1 3
1 4
2 5
3 4
4 7
5 6
6 7
 */