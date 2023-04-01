import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int V;
	static int[][] graph;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		graph = new int[N + 1][N + 1];
		visited = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = graph[b][a] = 1;
		}

		DFS(V);
        //방문처리 초기화
		visited = new boolean[N + 1];
		System.out.println();
		BFS(V);
	}

	public static void DFS(int n) {
		System.out.print(n + " ");
		visited[n] = true;

		for (int i = 1; i < N + 1; i++) {
			if (!visited[i] && graph[n][i] == 1) {
				DFS(i);
			}
		}
	}

	public static void BFS(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		visited[n] = true;

		while (!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr + " ");

			for (int i = 1; i < N + 1; i++) {
				if (!visited[i] && graph[curr][i] == 1) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}