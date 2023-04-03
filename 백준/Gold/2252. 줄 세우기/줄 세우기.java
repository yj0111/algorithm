import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N, M;
	static int[] degree;
	static ArrayList<Integer>[] list;
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sb = new StringBuilder();
		N = sc.nextInt();
		M = sc.nextInt();

		list = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		degree = new int[N + 1];

		int x, y;
		for (int i = 0; i < M; i++) {
			x = sc.nextInt();
			y = sc.nextInt();

			list[x].add(y);

			degree[y]++;
		}

		topologySort();
		System.out.println(sb);
	}

	private static void topologySort() {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			if (degree[i] == 0) {
				queue.add(i);
			}
		}

		for (int i = 1; i <= N; i++) {
			int k = queue.poll();

			sb.append(k).append(" ");

			for (int conn : list[k]) {
				if (--degree[conn] == 0) {
					queue.add(conn);
				}
			}
		}
	}

}