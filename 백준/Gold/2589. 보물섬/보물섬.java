import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N, M;
	static char[][] map;
	static boolean[][] visited;
	static int max;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		max = 0;
		map = new char[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String line = sc.next();

			map[i] = line.toCharArray();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'L') {
					visited = new boolean[N][M];
					bfs(i, j);
				}
			}
		}

		System.out.println(max);
	}

	private static void bfs(int y, int x) {
		if (map[y][x] == 'W') {
			return;
		}
		Queue<int[]> q = new LinkedList<int[]>();
		visited[y][x] = true;

		q.offer(new int[] { y, x, 0 });
		while (!q.isEmpty()) {

			int[] v = q.poll();
			int r = v[0];
			int c = v[1];
			int dist = v[2];

			max = Math.max(max, dist);

			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];

				if (nr >= 0 && nc >= 0 && nr < N & nc < M) {
					if (map[nr][nc] == 'L' && !visited[nr][nc]) {
						visited[nr][nc] = true;
						q.offer(new int[] { nr, nc, dist + 1 });
					}
				}
			}
		}
	}
}