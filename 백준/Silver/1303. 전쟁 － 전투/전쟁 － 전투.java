import java.util.Scanner;

public class Main {
	static int N, M;
	static char[][] map;
	static boolean[][] visited;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int totalPower;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		map = new char[M][N];
		visited = new boolean[M][N];

		for (int i = 0; i < M; i++) {
			String line = sc.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = line.charAt(j);
			}
		}

		// 우리 병사
		int W_team = 0;
		// 적국 병사
		int B_team = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					totalPower = 0;
					dfs(i, j, map[i][j]);
					if (map[i][j] == 'W') {
						W_team += totalPower * totalPower;
					} else {
						B_team += totalPower * totalPower;
					}
				}
			}
		}

		System.out.println(W_team + " " + B_team);
	}

	private static void dfs(int r, int c, char team) {
		visited[r][c] = true;
		totalPower++;

		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			if (nr >= 0 && nr < M && nc >= 0 && nc < N) {
				if (!visited[nr][nc] && map[nr][nc] == team) {
					dfs(nr, nc, team);
				}
			}
		}
	}
}