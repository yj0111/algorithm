import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	//대각선까지 봐야함 ;;
	static int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
	static int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };
	static int w, h;
	static int[][] map;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();

			if (w == 0 && h == 0) { 
				break;
			}

			map = new int[h][w];
			visited = new boolean[h][w];

			// 지도 정보 입력 받기
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			int cnt = 0; 

			// 지도 전체를 탐색하며 섬의 개수 카운트
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						bfs(i, j);
						cnt++;
					}
				}
			}

			System.out.println(cnt); // 섬의 개수 출력
		}
	}

	private static void bfs(int row, int col) {
		Queue<int[]> q = new LinkedList<>(); 
		q.offer(new int[] { row, col });

		visited[row][col] = true; 

		while (!q.isEmpty()) {
			int[] curr = q.poll();
			int r = curr[0];
			int c = curr[1];

			// 8방향 탐색
			for (int d = 0; d < 8; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];

				// 지도 범위 체크 및 방문 여부 체크
				if (nr >= 0 && nc >= 0 && nr < h && nc < w && !visited[nr][nc] && map[nr][nc] == 1) {
					visited[nr][nc] = true; // 방문 체크
					q.offer(new int[] { nr, nc }); // 큐에 추가
				}
			}
		}
	}
}