import java.util.*;

public class Main {
	static int N, M;
	static char[][] map;
	static boolean[][] visited;
	static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new char[N][M];
		visited = new boolean[N][M];
		count = 0;

		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = line.charAt(j);
			}
		}

		// 1. 일단 도연이의 위치 찾기
		int X = 0, Y = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'I') {
					X = i;
					Y = j;
					break;
				}
			}
		}

		// 2.DFS
		dfs(X, Y);

		// 3.결과 출력
		if (count == 0) {
			// 아무도 못만났어 ㅜㅜ
			System.out.println("TT");
		} else {
			System.out.println(count);
		}
	}

	// DFS
	private static void dfs(int x, int y) {
		visited[x][y] = true;

		if (map[x][y] == 'P') {
			count++;
		}

		// 상하좌우
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && map[nx][ny] != 'X') {
				dfs(nx, ny);
			}
		}
	}
}