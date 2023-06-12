import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int M, N, K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int size;
    static List<Integer> result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();

        map = new int[M][N];
        visited = new boolean[M][N];
        result = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int leftX = sc.nextInt();
            int leftY = sc.nextInt();
            int rightX = sc.nextInt();
            int rightY = sc.nextInt();

            //채워져있는 부분을 1로 표시하기
            for (int r = leftY; r < rightY; r++) {
                for (int c = leftX; c < rightX; c++) {
                    map[r][c] = 1;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    size = 0;
                    dfs(i, j);
                    //결과리스트에 추가하기!
                    result.add(size);
                }
            }
        }

        //결과 오름차순 정렬
        Collections.sort(result);
        
        //분리되어 나누어지는 영역의 개수 
        System.out.println(result.size());
        
        //각 넓이 출력
        for (int area : result) {
            System.out.print(area + " ");
        }
    }

    static void dfs(int r, int c) {
        visited[r][c] = true;
        size++;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (nr >= 0 && nr < M && nc >= 0 && nc < N) {
                if (map[nr][nc] == 0 && !visited[nr][nc]) {
                    dfs(nr, nc);
                }
            }
        }
    }
}