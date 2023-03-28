import java.util.Scanner;

public class Solution {
	static int N;
	static Point[] arr;
	static Point home, company;
	static boolean[] visited;
	static int[] result;
	static int min;

	static class Point {
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			arr = new Point[N];
			visited = new boolean[N];
			result = new int[N];

			company = new Point(sc.nextInt(), sc.nextInt());
			home = new Point(sc.nextInt(), sc.nextInt());

			for (int i = 0; i < N; i++) {
				arr[i] = new Point(sc.nextInt(), sc.nextInt());
			}

			min = Integer.MAX_VALUE;

			perm(0); 

			back(0, 0, company);

			System.out.println("#" + tc + " " + min);
		}
	}

	private static void back(int idx, int dist, Point cur) {
		if (dist > min)
			return;

		if (idx == N) {
			dist += Math.abs(cur.x - home.x) + Math.abs(cur.y - home.y);
			min = Math.min(min, dist);
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i])
				continue;

			visited[i] = true;
			back(idx + 1, dist + (Math.abs(cur.x - arr[i].x) + Math.abs(cur.y - arr[i].y)), arr[i]);
			visited[i] = false;
		}
	}

	private static void perm(int idx) {
		if (idx == N) {
			int dist = 0;

			Point cur = company;

			for (int i = 0; i < N; i++) {
				Point next = arr[result[i]];
				dist += Math.abs(cur.x - next.x) + Math.abs(cur.y - next.y);
				cur = next;
			}

			dist += Math.abs(cur.x - home.x) + Math.abs(cur.y - home.y);
			min = Math.min(dist, min);
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i])
				continue;

			result[idx] = i;
			visited[i] = true;
			perm(idx + 1);
			visited[i] = false;
		}
	}

}