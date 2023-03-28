import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	static int[][] map;
	static boolean[][] visited;
	static boolean possible;

	static int nr, nc;

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			sc.next();

			map = new int[16][16];
			visited = new boolean[16][16];

			possible = false;

			for (int r = 0; r < 16; r++) {
				String str = sc.next();
				for (int c = 0; c < 16; c++) {
					map[r][c] = str.charAt(c) - '0';
					if (map[r][c] == 2) {
						nr = r;
						nc = c;
					}
				}
			}

			bfs(nr, nc);

			if (possible) {
				System.out.println("#" + tc + " 1");
			}
			else {
				System.out.println("#" + tc + " 0");
			}

		}

	}

	private static void bfs(int ar, int ac) {
		Queue<int[]> q = new LinkedList<>();

		visited[ar][ac] = true;
		q.offer(new int[] { ar, ac });

		while (!q.isEmpty()) {
			int[] v = q.poll();
			int r = v[0];
			int c = v[1];

			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];

				if (nr < 0 || nr >= 16 || nc < 0 || nc >= 16)
					continue;

				if (map[nr][nc] == 3) {
					possible = true;
					return;
				}

				if (!visited[nr][nc] && map[nr][nc] == 0) {
					visited[nr][nc] = true;
					q.offer(new int[] { nr, nc });
				}
			}
		}
	}
}