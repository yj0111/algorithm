import java.util.Scanner;

public class Main {
	static int M, N, K;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			M = sc.nextInt(); 
			N = sc.nextInt(); 
			K = sc.nextInt(); 

			map = new int[N][M];
			visited = new boolean[N][M];

			for (int j = 0; j < K; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[y][x] = 1; // 배추있으면 1
			}

			int cnt = 0; // 필요한 지렁이 수

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					// 배추가 심어져 있고 방문하지 않았으면 !
					if (map[j][k] == 1 && !visited[j][k]) { 
						dfs(j, k); 
						cnt++;
					}
				}
			}

			System.out.println(cnt);
		}
	}

	public static void dfs(int r, int c) {
		visited[r][c] = true;
	    //방문했어용
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			if (nr >= 0 && nr < N && nc >= 0 && nc < M) { 
				if (map[nr][nc] == 1 && !visited[nr][nc]) {
					// 배추가 심어져 있고 방문하지 않은 경우
					dfs(nr, nc); 
				}
			}
		}
	}
}