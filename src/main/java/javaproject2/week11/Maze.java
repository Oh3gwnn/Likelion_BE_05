package javaproject2.week11;

import java.util.LinkedList;
import java.util.Queue;

public class Maze {

    // 방향 배열
    // dx[0], dy[0] : 위
    // dx[1], dy[1] : 아래
    // dx[2], dy[2] : 왼쪽
    // dx[3], dy[3] : 오른쪽
    private int[] dx = new int[]{-1, 1, 0, 0};
    private int[] dy = new int[]{0, 0, -1, 1};

    // 최단 거리를 반환하는 solution 메소드
    public int solution(int[][] maze) {
        // BFS 로직을 활용하며,
        // MAZE의 가로x세로 크기 이내의 인접한 칸을 체크하여 다음에 접근할 수 있는 칸 판단

        // int[] {x, y, 여태까지 이동거리}를 담는 Queue
        Queue<int[]> visitNext = new LinkedList<>();
        // 미로에서 이미 도달한 적이 있는 칸임을 나타내기 위한 visited[][]
        boolean[][] visited = new boolean[6][6];
        // 시작점 2의 위치
        visitNext.offer(new int[]{5, 0, 0});
        // 최단거리, 목적지 3에 도달하지 못했을 경우 -1
        int answer = -1;

        // BFS 시작
        // Queue가 비어있지 않을 때까지 반복
        while(!visitNext.isEmpty()) {
            int[] next = visitNext.poll(); // 다음에 이동할 곳
            int nowX = next[0]; // 현재 도달한 x
            int nowY = next[1]; // 현재 도달한 y
            int steps = next[2]; // 현재 이동거리

            // 현재 위치가 3이라면 break
            if(maze[nowX][nowY] == 3) {
                answer = steps;
                break;
            }

            // 현재 위치에 방문했다고 체크
            visited[nowX][nowY] = true;

            // 4개의 방향(위, 아래, 왼쪽, 오른쪽) 확인
            for(int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(
                    // 체크사항1. 미로의 범위를 벗어나지 않는지
                        checkBounds(nextX, nextY)
                                // 체크사항2. 미로에서 이동 가능한 칸인지(0 또는 3인지)
                                && (maze[nextX][nextY] == 0 || maze[nextX][nextY] == 3)
                                // 체크사항3. 아직 방문한 적 없는 칸인지
                                && !visited[nextX][nextY]) {
                    // 체크사항 모두 만족 시 해당 칸으로 이동
                    visitNext.offer(new int[]{nextX, nextY, steps + 1});
                }
            }
        }
        return answer;
    }

    // 미로의 범위 내에 있는지 검사하는 메소드
    private boolean checkBounds(int x, int y) {
        return -1 < x && x < 6 && -1 < y && y < 6;
    }

    public static void main(String[] args) {
        // 2가 시작점, 3이 목적지
        int answer = new Maze().solution(new int[][]{
                {0, 0, 0, 0, 0, 3},
                {1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0, 0},
                {2, 1, 1, 0, 1, 1}
        });
        System.out.println(answer);
    }
}
