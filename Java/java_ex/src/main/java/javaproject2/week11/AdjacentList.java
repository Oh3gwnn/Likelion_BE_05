package javaproject2.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AdjacentList {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer: 입력받은 문자열을 ' '(또는 지정 값)을 기준으로 나누어서 한 단어로 반환
        // split()이랑 비슷
        StringTokenizer graphTokenizer = new StringTokenizer(br.readLine());
        // StringTokenizer.nextToken(): 다음 단어 가져오기
        int maxNode = Integer.parseInt(graphTokenizer.nextToken());
        int edge = Integer.parseInt(graphTokenizer.nextToken());

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < maxNode; i++) adjList.add(new ArrayList<>());

        for (int i = 0; i < edge; i++) {
            StringTokenizer edgeTokenizer = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(edgeTokenizer.nextToken());
            int endNode = Integer.parseInt(edgeTokenizer.nextToken());

            // adjList의 startNode 번째 리스트에 endNode 첨부
            adjList.get(startNode).add(endNode);
            adjList.get(endNode).add(startNode); // 무향 그래프의 경우 추가
        }
        // 선택사항: DFS, BFS -> 방문 순서를 '작은 숫자부터'처럼
        // 조건을 붙이고 싶을 경우 정렬
        for (List<Integer> adjRow: adjList) Collections.sort(adjRow);


        // 출력
        for (List<Integer> adjRow: adjList) System.out.println(adjRow);
    }

    public static void main(String[] args) throws IOException {
        new AdjacentList().solution();
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