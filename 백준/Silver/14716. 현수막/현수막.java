import java.util.*;

public class Main {

    // 상 하 좌 우 좌상 우상 좌하 우하
    static int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
    static int[] dy = {0, 0, -1, 1, -1, -1, 1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] map = new int[M][N];
        boolean[][] visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int word = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    dfs(map, visited, i, j, M, N);
                    word++;
                }
            }
        }

        System.out.println(word);
    }

    static void dfs(int[][] map, boolean[][] visited, int x, int y, int M, int N) {
        visited[x][y] = true;

        for (int k = 0; k < 8; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    dfs(map, visited, nx, ny, M, N);
                }
            }
        }
    }
}