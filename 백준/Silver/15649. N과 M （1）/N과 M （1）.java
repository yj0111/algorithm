import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] list;
	static int[] result;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		list = new int[N + 1];
		result = new int[M]; // 결과 순열
		visited = new boolean[N + 1];

		// list 에 1~ N까지 담기
		for (int i = 1; i <= N; i++) {
			list[i] = i;
		}

		check(0);

	}

	public static void check(int idx) {
		if (idx == M) {
			for (int i = 0; i < M; i++) {
				if (result[i] != 0) {
					System.out.print(result[i] + " ");
				}
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (visited[i]) {
				continue;
			}
			result[idx] = list[i];
			visited[i] = true;

			check(idx + 1);
			visited[i] = false;

		}
	}
}