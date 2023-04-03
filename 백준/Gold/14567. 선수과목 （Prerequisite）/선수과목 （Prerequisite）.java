import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N, M;
	static ArrayList<Integer>[] list;
	static StringBuilder sb;
	static int[] degree, result;

	static class Node {
		int x, w;

		public Node(int x, int w) {
			this.x = x;
			this.w = w;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		list = new ArrayList[N + 1];
		sb = new StringBuilder();

		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		degree = new int[N + 1];
		result = new int[N + 1];

		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list[x].add(y);
			degree[y]++;
		}

		topologySort();
		System.out.println(sb);
	}

	static void topologySort() {
		Queue<Node> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			if (degree[i] == 0) {
				queue.add(new Node(i, 1));
			}
		}

		for (int i = 1; i <= N; i++) {
			Node curr = queue.poll();
			result[curr.x] = curr.w;

			for (int conn : list[curr.x]) {
				if (--degree[conn] == 0) {
					queue.add(new Node(conn, curr.w + 1));
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			sb.append(result[i] + " ");
		}
	}
}