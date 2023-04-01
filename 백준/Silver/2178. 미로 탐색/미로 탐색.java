import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int[][] maze;
    static int[][] result;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        result = new int[N][M];

        //수가 붙어서 입력됨 
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
                result[i][j] = -1; 
            }
        }

        bfs(0, 0);

        System.out.println(result[N - 1][M - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        result[x][y] = 1;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = curr[0] + dx[i];
                int ny = curr[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= maze.length || ny >= maze[0].length) {
                	continue;
                }
                if (maze[nx][ny] == 0 || result[nx][ny] != -1) {
                	continue;
                }

                queue.offer(new int[]{nx, ny});
                result[nx][ny] = result[curr[0]][curr[1]] + 1;
            }
        }
    }
}