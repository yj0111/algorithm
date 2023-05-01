import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int N, M;
	static boolean[] visited;
	static int[] dp;
	static ArrayList<Node>[] graph;

	static class Node implements Comparable<Node> {
		int index;
		int value;

		Node(int index, int value) {
			this.index = index;
			this.value = value;
		}

		@Override
		public int compareTo(Node o) {
			return this.value - o.value;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		visited = new boolean[N + 1];
		dp = new int[N + 1];
		for (int i = 2; i <= N; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		graph = new ArrayList[N + 1];
		for (int n = 0; n <= N; n++) {
			graph[n] = new ArrayList<>();
		}
		for (int m = 0; m < M; m++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph[a].add(new Node(b, c));
			graph[b].add(new Node(a, c));
		}
		// 기본 셋팅 완료.

		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(1, 0));

		
		
		
		while (!pq.isEmpty()) {
			Node node = pq.poll();
			if(visited[node.index]) {
				continue;
			}
			visited[node.index]=true;
			for (Node nodeTmp : graph[node.index]) {
				if (!visited[nodeTmp.index]&&dp[nodeTmp.index]>dp[node.index]+nodeTmp.value) {
						dp[nodeTmp.index]=dp[node.index]+nodeTmp.value;
						pq.add(new Node(nodeTmp.index, dp[nodeTmp.index]));
						
					
				}
			}
		}
		System.out.println(dp[N]);
	}
}