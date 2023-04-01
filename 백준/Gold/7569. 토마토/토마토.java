import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int H = sc.nextInt();

        int[][][] box = new int[H][N][M];
        int[][][] days = new int[H][N][M];

        // 상하좌우위아래
        int[] dx = { -1, 0, 1, 0, 0, 0 };
        int[] dy = { 0, 1, 0, -1, 0, 0 };
        int[] dz = { 0, 0, 0, 0, 1, -1 };

        Queue<int[]> queue = new LinkedList<>();

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    box[k][i][j] = sc.nextInt();
                    if (box[k][i][j] == 1) {
                        queue.offer(new int[] { k, i, j });
                    }
                }
            }
        }

        // BFS
        while (!queue.isEmpty()) {
            int[] tomato = queue.poll();
            int z = tomato[0];
            int x = tomato[1];
            int y = tomato[2];
            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && nz >= 0 && nz < H && box[nz][nx][ny] == 0) {
                    // 토마토 익었어용
                    box[nz][nx][ny] = 1;
                    days[nz][nx][ny] = days[z][x][y] + 1;
                    queue.offer(new int[] { nz, nx, ny });
                }
            }
        }

        // 토마토가 모두 익었는지 확인
        int result = 0;
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 익지 않은 토마토가 있으면
                    if (box[k][i][j] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    result = Math.max(result, days[k][i][j]);
                }
            }
        }

        System.out.println(result);
    }
}