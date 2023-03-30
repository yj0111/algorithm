import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static final int INF = Integer.MAX_VALUE;

	static class Edge implements Comparable<Edge> {
		int start, end, w;

		public Edge(int start, int end, int w) {
			this.start = start;
			this.end = end;
			this.w = w;
		}

		@Override
		public int compareTo(Edge o) {
			return this.w - o.w;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		List<Edge>[] adjList = new ArrayList[N + 1];

		for (int i = 0; i <= N; i++) {
			adjList[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());

			// 무향그래프
			adjList[A].add(new Edge(A, B, W));
			adjList[B].add(new Edge(B, A, W));
		}
		boolean[] visited = new boolean[N + 1];

		PriorityQueue<Edge> pq = new PriorityQueue<>();

		visited[1] = true;

		pq.addAll(adjList[1]);

		int pick = 1;
		List<Integer> ans = new ArrayList<>();

		while (pick != N) {
			Edge e = pq.poll();
			if (visited[e.end]) {
				continue;
			} else {
				ans.add(e.w);
				pq.addAll(adjList[e.end]);
				visited[e.end] = true;
				pick++;
			}
		}
		Collections.sort(ans);
		int result = 0;
		for (int i = 0; i < ans.size() - 1; i++) {
			result += ans.get(i);
		}
		bw.append(String.valueOf(result));
		bw.flush();
	}

}