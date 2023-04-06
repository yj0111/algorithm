import java.util.Scanner;

public class Solution {
	static int N, K;// 한 변의 길이 , 최대 공사 가능 깊이
	static int high, max; // 가장 높은 곳 , 가장 긴 등산로
	static int[][] map;// 지도
	static boolean[][] visited;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			map = new int[N][N];
			visited = new boolean[N][N];
			K = sc.nextInt();
			high = 0;
			max = 0;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
					high = Math.max(high, map[r][c]); // 맨 꼭대기 구하기
				}
			}
			// System.out.println(high);

			// 맨 꼭대기에서 시작하기
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					if (map[r][c] == high && !visited[r][c]) {
						visited[r][c] = true;
						dfs(r, c, 1, 1);
						visited[r][c] = false;
					}
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}

	public static void dfs(int x, int y, int count, int cut) {
		int now = map[x][y];

		// 위 아래 양옆으로만 갈수있어
		for (int d = 0; d < 4; d++) {
			int nr = x + dr[d];
			int nc = y + dc[d];

			// 경계체크
			if (nr >= 0 && nc >= 0 && nr < N && nc < N) {
				int next = map[nr][nc];

				// 방문하지 않았다면
				if (next != 0 && !visited[nr][nc]) {
					// 경사가 지금보다 더 낮아야 갈수있음
					if (next < now) {
						visited[nr][nc] = true;
						dfs(nr, nc, count + 1, cut);
						visited[nr][nc] = false;
					} else if (cut == 1) {
						for (int j = 1; j <= K; j++) {
							if ((next - j) < now) {
								map[nr][nc] -= j;
								dfs(nr, nc, count + 1, cut - 1);
								map[nr][nc] += j;
							}
						}
					}
				}
			}
		}

		if (count > max) {
			max = count;
		}
	}

}