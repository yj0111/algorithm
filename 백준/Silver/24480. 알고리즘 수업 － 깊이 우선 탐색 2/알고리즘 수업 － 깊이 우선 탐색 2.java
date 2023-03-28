import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	// 이차원 배열로 하니까 메모리 초과남 !
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static int cnt;
	static int[] check;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		// 정점의 수
		int N = Integer.parseInt(st.nextToken());

		// 간선의 수
		int M = Integer.parseInt(st.nextToken());

		check = new int[N + 1];
		visited = new boolean[N + 1];

		// 시작 정점
		int R = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N + 1; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			graph.get(a).add(b);
			graph.get(b).add(a);
		}

		cnt = 0;
		
		//2번문제는 내림차순으로 ! 
		for (int i = 1; i < N + 1; i++) {
			Collections.sort(graph.get(i),Collections.reverseOrder());
		}

		// DFS 시작 !
		DFS(R);

		// 방문하지 않으면 0 출력
		for (int i = 1; i < N + 1; i++) {
			sb.append(check[i]).append("\n");
		}

		System.out.println(sb);
	}

	private static void DFS(int r) throws IOException {
		visited[r] = true;
		check[r] = ++cnt;

		for (int i = 0; i < graph.get(r).size(); i++) {
			int X = graph.get(r).get(i);

			if (!visited[X]) {
				DFS(X);
			}
		}

	}

}