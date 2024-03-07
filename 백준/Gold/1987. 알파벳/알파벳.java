import java.io.*;
import java.util.*;

public class Main {
    static int r, c;
    static int[][] map;
    static boolean[] visited;
    static int max = 0;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new int[r][c];
        visited = new boolean[26]; // 알파벳 방문 여부

        for (int i = 0; i < 26; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                char alpha = line.charAt(j);
                map[i][j] = alpha - 'A';
            }
        }

        dfs(0, 0, 1); // 시작점의 알파벳은 항상 포함되므로 cnt를 1로 시작
        System.out.println(max);
    }

    static void dfs(int x, int y, int cnt) {
        visited[map[x][y]] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                if (!visited[map[nx][ny]]) {
                    dfs(nx, ny, cnt + 1);
                }
            }
        }

        visited[map[x][y]] = false; 
        max = Math.max(max, cnt);
    }
}