import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] dr = { -1, -2, -2, -1, 1, 2, 2, 1 };
	static int[] dc = { -2, -1, 1, 2, -2, -1, 1, 2 };
	static int[][] map;
	static boolean[][] visited;
	static int N, x1, y1, x2, y2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 수
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			// 체스판의 한변의 길이
			N = sc.nextInt();

			// 체스판
			map = new int[N][N];
			visited = new boolean[N][N];

			// 현재 위치
			x1 = sc.nextInt();
			y1 = sc.nextInt();

			// 이동하려고 하는 위치
			x2 = sc.nextInt();
			y2 = sc.nextInt();

			bfs();

		}

	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		// 현재 위치
		q.offer(new int[] { x1, y1 });
		visited[x1][y1] = true;

		// 하나 꺼내쇼
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0];
			int c = cur[1];

			// 원하는 위치에 가면
			if (r == x2 && c == y2) {
				System.out.println(map[r][c]);
				return;
			}

			for (int d = 0; d < 8; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];

				if (nr >= 0 && nc >= 0 && nr < N && nc < N) {
					if (!visited[nr][nc]) {
						visited[nr][nc] = true;
						map[nr][nc] = map[r][c] + 1;
						q.offer(new int[] { nr, nc });
					}
				}
			}
		}
	}
}