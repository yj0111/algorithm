import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int[] dc = { -1, 0, 1, 0 };
	static int[] dr = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N][N];
		ArrayList<Integer> result = new ArrayList<>();

		// 다 붙어있어서 line으로 받아서 짤라야해
		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					int count = dfs(i, j, 0);
					result.add(count);
				}
			}
		}

		// 오름차순
		Collections.sort(result);

		// 총 단지수
		System.out.println(result.size());

		// 각단지내 집의 수
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int dfs(int r, int c, int count) {
		visited[r][c] = true;
		count++;

		for (int i = 0; i < 4; i++) {
			int nr = r + dc[i];
			int nc = c + dr[i];

			if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
				if (map[nr][nc] == 1 && !visited[nr][nc]) {
					count = dfs(nr, nc, count);
				}
			}
		}
		return count;
	}
}