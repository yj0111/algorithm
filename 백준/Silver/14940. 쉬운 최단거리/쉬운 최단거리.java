import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] map;
	static int[][] result; // 2랑 얼마나 거리 차이나는지 ?
	static int two_X, two_Y; // 2의 위치

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		result = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 2) { // 2를 찾자
					two_X = i;
					two_Y = j;
				}
			}
		}

		bfs();

		// 결과
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0) {
					bw.write("0 ");
				} else if(map[i][j] == 1 && result[i][j] == 0) {
					bw.write("-1 ");
				}else {
					bw.write(result[i][j] + " ");
				}
			}
			bw.write("\n");
		}

		bw.flush();
	}

	private static void bfs() {
		Queue<int[]> queue = new ArrayDeque<>();
		queue.offer(new int[] { two_X, two_Y });

		result[two_X][two_Y] = 0; 

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
					if (map[nx][ny] == 1 && result[nx][ny] == 0) {
						queue.offer(new int[] { nx, ny });
						result[nx][ny] = result[x][y] + 1;
					}
				}
			}
		}
	}
}