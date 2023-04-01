import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] box = new int[N][M];
		int[][] days = new int[N][M];

		// 상하좌우
		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, 1, 0, -1 };

		Queue<int[]> queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				box[i][j] = sc.nextInt();
				if (box[i][j] == 1) {
					queue.offer(new int[] { i, j });
				}
			}
		}

		// BFS
		while (!queue.isEmpty()) {
			int[] tomato = queue.poll();
			int x = tomato[0];
			int y = tomato[1];
			for (int i = 0; i < 4; i++) {
				int nr = x + dr[i];
				int nc = y + dc[i];
				if (nr >= 0 && nr < N && nc >= 0 && nc < M && box[nr][nc] == 0) {
					// 토마토 익었어용
					box[nr][nc] = 1;
					days[nr][nc] = days[x][y] + 1;
					queue.offer(new int[] { nr, nc });
				}
			}
		}

		// 토마토가 모두 익었는지 확인
		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 익지 않은 토마토가 있으면
				if (box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				result = Math.max(result, days[i][j]);
			}
		}

		System.out.println(result);
	}
}