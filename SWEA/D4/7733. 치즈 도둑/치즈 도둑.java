import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int N;
	static int T;
	static int map[][];
	static int result;
	static int dr[] = { 1, -1, 0, 0 };
	static int dc[] = { 0, 0, 1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			N = sc.nextInt();
			map = new int[N][N];
			result = 1; 

			// 치즈 입력
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			// 치즈 세기
			check();

			for (int i = 1; i <= 100; i++) {
				bfs(i);
				check();
			}

			System.out.printf("#%d %d\n", tc, result);
		}
	}

	// 몇개인지 세기
	private static void check() {
		int cnt = 0;
		boolean[][] visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] != 0 && visited[i][j] == false) {
					// 방문 처리
					visited[i][j] = true;

					Queue<Integer[]> queue = new LinkedList<Integer[]>();
					queue.add(new Integer[] { i, j });
					while (queue.size() != 0) {
						int y = queue.peek()[0];
						int x = queue.peek()[1];
						queue.poll();
						// 방향마다 탐색하기
						for (int k = 0; k < 4; k++) {
							int nc = y + dc[k];
							int nr = x + dr[k];
							if (nr < 0 || nc < 0 || nr >= N || nc >= N)
								continue;
							if (visited[nc][nr])
								continue;
							if (map[nc][nr] == 0)
								continue;

							visited[nc][nr] = true;
							queue.add(new Integer[] { nc, nr });
						}
					}
					cnt += 1;
				}
			}
		}
		if (cnt > result) {
			result = cnt;
		}
	}

	// N일에 N번 치즈 먹기
	private static void bfs(int num) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == num) {
					map[i][j] = 0;
				}
			}
		}
	}
}