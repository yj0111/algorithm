import java.util.Scanner;

public class Main {

	static int[][] graph = new int[1001][1001];
	static int N;
	static int M;
	static boolean[] visited = new boolean[1001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		int u, v;

		for (int i = 0; i < M; i++) {
			u = sc.nextInt();
			v = sc.nextInt();

			// 간선 연결
			graph[u][v] = graph[v][u] = 1;
		}

		int cnt = 0;

		for (int i = 1; i <= N; i++) {
			if (visited[i] == false) {
				dfs(i);
				cnt++;
			}
		}

		System.out.println(cnt);

		return;
	}

	public static void dfs(int idx) {
		if (visited[idx] == true)
			return;
		else {
			visited[idx] = true;
			for (int i = 1; i <= N; i++) {
				if (graph[idx][i] == 1) {
					dfs(i);
				}
			}
		}
	}
}