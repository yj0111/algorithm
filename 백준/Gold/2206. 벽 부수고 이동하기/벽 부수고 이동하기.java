import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N, M, min;
	static int[][] map;
	static boolean[][][] visited; // 3차원 배열로 방문처리!!!이게 포인트당
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		min = Integer.MAX_VALUE;
		map = new int[N][M];
		// 상태 2개(벽을 뿌셨거나, 아니거나)
		visited = new boolean[N][M][2];

		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}
		
		// bfs 시작
		bfs();

		if (min == Integer.MAX_VALUE) { // 불가능
			System.out.println("-1");
		} else {
			System.out.println(min);
		}
	}

	private static void bfs() {
		Queue<int[]> q = new LinkedList<int[]>();
		// r,c(좌표),cnt(벽 부순횟수) , len(거리)
		// 방문처리 해주고 넣기 !
		visited[0][0][0] = true;
		q.offer(new int[] { 0, 0, 0, 1 });

		while (!q.isEmpty()) {
			int[] v = q.poll();

			int r = v[0];
			int c = v[1];
			int cnt = v[2];
			int len = v[3];

			// 목표 지점
			if (r == N - 1 && c == M - 1) {
				min = Math.min(len, min);
			}

			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];

				if (nr >= 0 && nc >= 0 && nr < N && nc < M) {

					// 벽이 아니면&& 방문 안함
					if (map[nr][nc] == 0 && !visited[nr][nc][cnt]) {
						visited[nr][nc][cnt] = true;
						q.offer(new int[] { nr, nc, cnt, len + 1 });
					}

					// 벽이면 && 벽 뿌신 횟수가 0번 && 방문 안함
					if (map[nr][nc] == 1 && cnt == 0 && !visited[nr][nc][cnt + 1]) {
						visited[nr][nc][cnt + 1] = true;
						q.offer(new int[] { nr, nc, cnt + 1, len + 1 });
					}
				}
			}
		}
	}
}